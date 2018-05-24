package com.jiyun.asmodeus.xy.model.utils;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.OvershootInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.facebook.drawee.view.SimpleDraweeView;
import com.jiyun.asmodeus.xy.R;
import com.jiyun.asmodeus.xy.model.entity.IMGift;
import com.jiyun.asmodeus.xy.view.ui.CustomRoundView;
import com.jiyun.asmodeus.xy.view.ui.MagicTextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class LiveGiftUtil {
    /**
     * 动画相关
     */
    private NumAnim giftNumAnim;
    private TranslateAnimation inAnim;
    private TranslateAnimation outAnim;
    private AnimatorSet animatorSetHide = new AnimatorSet();
    private AnimatorSet animatorSetShow = new AnimatorSet();
    private Timer giftTimer;

    /**
     * 数据相关
     */
    private List<View> giftViewCollection = new ArrayList<View>();


    /**
     * 数字放大动画
     */
    public class NumAnim {
        private Animator lastAnimator = null;

        public void start(View view) {
            if (lastAnimator != null) {
                lastAnimator.removeAllListeners();
                lastAnimator.end();
                lastAnimator.cancel();
            }
            ObjectAnimator anim1 = ObjectAnimator.ofFloat(view, "scaleX", 1.3f, 1.0f);
            ObjectAnimator anim2 = ObjectAnimator.ofFloat(view, "scaleY", 1.3f, 1.0f);
            AnimatorSet animSet = new AnimatorSet();
            lastAnimator = animSet;
            animSet.setDuration(200);
            animSet.setInterpolator(new OvershootInterpolator());
            animSet.playTogether(anim1, anim2);
            animSet.start();
        }
    }

    /**
     * 定时清除礼物
     */
    public void clearTiming(final LinearLayout llgiftcontent, final FragmentActivity context) {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                int count = llgiftcontent.getChildCount();
                for (int i = 0; i < count; i++) {
                    View view = llgiftcontent.getChildAt(i);
                    CustomRoundView crvheadimage = (CustomRoundView) view.findViewById(R.id.crvheadimage);
                    long nowtime = System.currentTimeMillis();
                    long upTime = (Long) crvheadimage.getTag();
                    if ((nowtime - upTime) >= 3000) {
                        removeGiftView(i, llgiftcontent, context);
                        return;
                    }
                }
            }
        };
        giftTimer = new Timer();
        giftTimer.schedule(task, 0, 3000);
    }

    /**
     * 删除礼物view
     */
    private void removeGiftView(final int index, final LinearLayout llgiftcontent, final FragmentActivity context) {
        final View removeView = llgiftcontent.getChildAt(index);
        outAnim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                llgiftcontent.removeViewAt(index);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });
        context.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                removeView.startAnimation(outAnim);
            }
        });
    }

    /**
     * 添加礼物view,(考虑垃圾回收)
     */
    private View addGiftView(LinearLayout llgiftcontent, FragmentActivity context) {
        View view = null;
        if (giftViewCollection.size() <= 0) {
            /*如果垃圾回收中没有view,则生成一个*/
            view = LayoutInflater.from(context).inflate(R.layout.item_gift, null);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            lp.topMargin = 10;
            view.setLayoutParams(lp);
            llgiftcontent.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                @Override
                public void onViewAttachedToWindow(View view) {
                }

                @Override
                public void onViewDetachedFromWindow(View view) {
                    giftViewCollection.add(view);
                }
            });
        } else {
            view = giftViewCollection.get(0);
            giftViewCollection.remove(view);
        }
        return view;
    }


    /**
     * 显示礼物的方法
     */
    public  void showGift(IMGift imGift, LinearLayout llgiftcontent, FragmentActivity context) {

        if (giftNumAnim == null) {
            giftNumAnim = new NumAnim();
        }
        inAnim = (TranslateAnimation) AnimationUtils.loadAnimation(context, R.anim.gift_in);
        outAnim = (TranslateAnimation) AnimationUtils.loadAnimation(context, R.anim.gift_out);

        String tag = imGift.getData().getGiftNo() + "";
        View giftView = llgiftcontent.findViewWithTag(tag);
        if (giftView == null) {/*该用户不在礼物显示列表*/

            if (llgiftcontent.getChildCount() > 2) {/*如果正在显示的礼物的个数超过两个，那么就移除最后一次更新时间比较长的*/
                View giftView1 = llgiftcontent.getChildAt(0);
                CustomRoundView picTv1 = (CustomRoundView) giftView1.findViewById(R.id.crvheadimage);
                long lastTime1 = (Long) picTv1.getTag();
                View giftView2 = llgiftcontent.getChildAt(1);
                CustomRoundView picTv2 = (CustomRoundView) giftView2.findViewById(R.id.crvheadimage);
                long lastTime2 = (Long) picTv2.getTag();
                if (lastTime1 > lastTime2) {/*如果第二个View显示的时间比较长*/
                    removeGiftView(1, llgiftcontent, context);
                } else {/*如果第一个View显示的时间长*/
                    removeGiftView(0, llgiftcontent, context);
                }
            }

            giftView = addGiftView(llgiftcontent, context);/*获取礼物的View的布局*/
            giftView.setTag(tag);/*设置view标识*/

            CustomRoundView crvheadimage = (CustomRoundView) giftView.findViewById(R.id.crvheadimage);
            final MagicTextView giftNum = (MagicTextView) giftView.findViewById(R.id.giftNum);/*找到数量控件*/
            final ImageView ivGift = (ImageView) giftView.findViewById(R.id.ivgift);/*找到数量控件*/
            final TextView tvUserName = (TextView) giftView.findViewById(R.id.tv_gift_user_name);/*找到数量控件*/
            final TextView tvGiftName = (TextView) giftView.findViewById(R.id.tv_gift_send_gift_name);/*找到数量控件*/
            giftNum.setText("x" + imGift.getData().getGiftNum());/*设置礼物数量*/
            crvheadimage.setTag(System.currentTimeMillis());/*设置时间标记*/
            giftNum.setTag(1);/*给数量控件设置标记*/
            String coverPath = imGift.getData().getSendUser().getAvatar();
            String giftPath = imGift.getData().getGiftPic();
            String username = imGift.getData().getSendUser().getNickName();
            String giftName = imGift.getData().getGiftName();

            tvGiftName.setText("送了" + giftName + "给主播 ");
            tvUserName.setText(username);
         /*   Glide.with(context)
                    .load(coverPath)

                    .into(crvheadimage);*/

            if (giftPath != null) {
               /* //创建将要下载的图片的URI
                Uri imageUri = Uri.parse(giftPath);
                //开始下载
                ivGift.setImageURI(imageUri);*/
               Glide.with(context).load(giftPath).into(ivGift);
            }


            llgiftcontent.addView(giftView);/*将礼物的View添加到礼物的ViewGroup中*/
            llgiftcontent.invalidate();/*刷新该view*/
            giftView.startAnimation(inAnim);/*开始执行显示礼物的动画*/
            inAnim.setAnimationListener(new Animation.AnimationListener() {/*显示动画的监听*/
                @Override
                public void onAnimationStart(Animation animation) {
                }

                @Override
                public void onAnimationEnd(Animation animation) {
                    giftNumAnim.start(giftNum);
                }

                @Override
                public void onAnimationRepeat(Animation animation) {
                }
            });
        } else {/*该用户在礼物显示列表*/
            CustomRoundView crvheadimage = (CustomRoundView) giftView.findViewById(R.id.crvheadimage);/*找到头像控件*/
            MagicTextView giftNum = (MagicTextView) giftView.findViewById(R.id.giftNum);/*找到数量控件*/
            int showNum = (Integer) giftNum.getTag() + 1;
            Log.e("礼物: ", "礼物数量 :  " + imGift.getData().getGiftNum());
            Log.e("礼物: ", "textview礼物数量 :  " + giftNum.getText().toString());

            String oldGiftNumStr = giftNum.getText().toString();
            int oldGiftNum = Integer.parseInt(oldGiftNumStr.replaceAll("x", ""));
//            int giftNums = Integer.parseInt(giftNum.getText().toString())+imGift.getData().getGiftNum();
            int giftNumInt = oldGiftNum + imGift.getData().getGiftNum();
            giftNum.setText("x" + giftNumInt);
            giftNum.setTag(showNum);
            crvheadimage.setTag(System.currentTimeMillis());
            giftNumAnim.start(giftNum);
        }
    }

}
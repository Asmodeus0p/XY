package com.jiyun.asmodeus.xy.view.activity;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.jiyun.asmodeus.xy.R;
import com.jiyun.asmodeus.xy.contract.IGiftContract;
import com.jiyun.asmodeus.xy.model.entity.GiftBean;
import com.jiyun.asmodeus.xy.model.entity.RenqizhuboBean;
import com.jiyun.asmodeus.xy.presenter.GiftPresenter;
import com.jiyun.asmodeus.xy.view.adapter.GiftPopuAdapter;
import com.jiyun.asmodeus.xy.view.adapter.PoPuGridAdapter;
import com.jiyun.asmodeus.xy.view.base.BaseActivity;
import com.jiyun.asmodeus.xy.view.fragments.GiftFragment;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.ui.TXCloudVideoView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import butterknife.BindView;
import butterknife.OnClick;


public class SeeLiveActivity extends BaseActivity implements IGiftContract.View, View.OnClickListener {
    private CheckBox checkbox;
    @BindView(R.id.start_live_video_view)
    TXCloudVideoView startLiveVideoView;
    @BindView(R.id.start_live_icon)
    ImageView startLiveIcon;
    @BindView(R.id.start_live_nickname)
    TextView startLiveNickname;
    @BindView(R.id.start_live_onLine_count)
    TextView startLiveOnLineCount;
    @BindView(R.id.start_live_recy)
    RecyclerView startLiveRecy;
    @BindView(R.id.start_live_finish)
    ImageView startLiveFinish;
    @BindView(R.id.start_live_liveNo)
    TextView startLiveLiveNo;
    @BindView(R.id.start_live_contribution_count)
    TextView startLiveContributionCount;
    @BindView(R.id.start_live_talking_list)
    ListView startLiveTalkingList;
    @BindView(R.id.start_live_music)
    ImageView startLiveMusic;
    @BindView(R.id.start_live_message)
    ImageView startLiveMessage;
    @BindView(R.id.start_live_switch)
    ImageView startLiveSwitch;
    @BindView(R.id.start_live_gift)
    ImageView startLiveGift;
    @BindView(R.id.start_live_activity)
    RelativeLayout startLiveActivity;
    private TXLivePlayer mLivePlayer;
    private ViewPager gift_viewpager;
    private TabLayout gift_tab;
    private TextView popup_gift_send;
    private TextView popup_recharge;
    private View lastView;
    private TextView popup_gift_count;


    public static void start(Activity activity, RenqizhuboBean.DataBean.ListBean listBean) {
        Intent intent = new Intent(activity, SeeLiveActivity.class);
        intent.putExtra("RenqizhuboBeanlistBean", listBean);
        activity.startActivity(intent);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_start_live;
    }

    @Override
    protected void initData() {
        RenqizhuboBean.DataBean.ListBean bean = (RenqizhuboBean.DataBean.ListBean) getIntent().getSerializableExtra("RenqizhuboBeanlistBean");
        Glide.with(this).load(bean.getCover()).into(startLiveIcon);
        startLiveNickname.setText(bean.getNickName());
        startLiveOnLineCount.setText("在线人数：" + bean.getViewNum());
        startLiveLiveNo.setText(String.valueOf(bean.getLiveId()));
        startLiveSwitch.setVisibility(View.GONE);
        //创建 player 对象
        mLivePlayer = new TXLivePlayer(this);

        //关键 player 对象与界面 view
        mLivePlayer.setPlayerView(startLiveVideoView);
        String flvUrl = bean.getHlsPullUrl();
        mLivePlayer.startPlay(flvUrl, TXLivePlayer.PLAY_TYPE_LIVE_FLV);
    }

    @Override
    protected void initView() {

    }

    public void onDestroy() {
        super.onDestroy();
        mLivePlayer.stopPlay(true); // true 代表清除最后一帧画面
        startLiveVideoView.onDestroy();
    }

    @OnClick({R.id.start_live_finish, R.id.start_live_music, R.id.start_live_message, R.id.start_live_switch, R.id.start_live_gift})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.start_live_finish:

                finish();
                break;
            case R.id.start_live_music:

                break;
            case R.id.start_live_message:

                break;
            case R.id.start_live_switch:

                break;
            case R.id.start_live_gift:
                IGiftContract.Presenter presenter = new GiftPresenter(this);
                presenter.GetGift();
                break;
        }
    }

    @Override
    public void showGift(GiftBean createRoomBean) {
        initGiftpopu(createRoomBean);

    }

    private void initGiftpopu(GiftBean createRoomBean) {
        View view = getLayoutInflater().inflate(R.layout.giftpopu, null);
        gift_viewpager = view.findViewById(R.id.gift_Viewpager);
        popup_gift_send = view.findViewById(R.id.popup_gift_send);
        popup_recharge = view.findViewById(R.id.popup_recharge);
        popup_gift_count = view.findViewById(R.id.popup_gift_count);
        popup_gift_send.setOnClickListener(this);
        popup_gift_count.setOnClickListener(this);
        popup_recharge.setOnClickListener(this);
        ArrayList<View> f = new ArrayList<>();


        List<GiftBean.DataBean.ListBean> list = createRoomBean.getData().getList();
        ArrayList<GiftBean.DataBean.ListBean> listBean1 = new ArrayList<>();
        listBean1.add(list.get(0));
        listBean1.add(list.get(1));
        listBean1.add(list.get(2));
        listBean1.add(list.get(3));
        listBean1.add(list.get(4));
        listBean1.add(list.get(5));
        ArrayList<GiftBean.DataBean.ListBean> listBean2 = new ArrayList<>();
        listBean2.add(list.get(6));
        listBean2.add(list.get(7));
        listBean2.add(list.get(8));
        listBean2.add(list.get(9));
        listBean2.add(list.get(10));
        listBean2.add(list.get(11));
        ArrayList<GiftBean.DataBean.ListBean> listBean3 = new ArrayList<>();
        listBean3.add(list.get(12));
        listBean3.add(list.get(13));
        listBean3.add(list.get(14));
        listBean3.add(list.get(15));
        listBean3.add(list.get(16));
        listBean3.add(list.get(17));
        View view1 = LayoutInflater.from(this).inflate(R.layout.fragment_gift, null);

        View view2 = LayoutInflater.from(this).inflate(R.layout.fragment_gift, null);

        View view3 = LayoutInflater.from(this).inflate(R.layout.fragment_gift, null);
        f.add(view1);
        f.add(view2);
        f.add(view3);
        RecyclerView Gift_Recy1 = view1.findViewById(R.id.Gift_Recy);

        Gift_Recy1.setLayoutManager(new GridLayoutManager(this, 3) {
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        });
        PoPuGridAdapter poPuGridAdapter1 = new PoPuGridAdapter((ArrayList<GiftBean.DataBean.ListBean>) listBean1);
        Gift_Recy1.setAdapter(poPuGridAdapter1);
        RecyclerView Gift_Recy2 = view2.findViewById(R.id.Gift_Recy);
        Gift_Recy2.setLayoutManager(new GridLayoutManager(this, 3) {
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        });
        PoPuGridAdapter poPuGridAdapter2 = new PoPuGridAdapter((ArrayList<GiftBean.DataBean.ListBean>) listBean2);
        Gift_Recy2.setAdapter(poPuGridAdapter2);
        RecyclerView Gift_Recy3 = view3.findViewById(R.id.Gift_Recy);
        Gift_Recy3.setLayoutManager(new GridLayoutManager(this, 3) {
                                        @Override
                                        public boolean canScrollVertically() {
                                            return false;
                                        }
                                    }
        );
        PoPuGridAdapter poPuGridAdapter3 = new PoPuGridAdapter((ArrayList<GiftBean.DataBean.ListBean>) listBean3);
        Gift_Recy3.setAdapter(poPuGridAdapter3);
        gift_viewpager.setAdapter(new GiftPopuAdapter(f));
        PopupWindow mPopup = new PopupWindow(this);
        //加载一个视图模板
        mPopup.setContentView(view);
        //给他设置高度和宽度
        mPopup.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);
        mPopup.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
        mPopup.setFocusable(true);
        //设置处理Popup其他地方能点击 通过两个方法相辅相成才能实现这个跟Android模拟机的版本有关
        mPopup.setOutsideTouchable(true);
        //在java代码里写一些组件的颜色背景 Android提供一个可以把16进制色值的参数转成Android可以识别值
        mPopup.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ffffff")));
        mPopup.showAtLocation(findViewById(R.id.act_start_live), Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
        poPuGridAdapter1.setOnItem(new PoPuGridAdapter.OnItemClick() {

            @Override
            public void setOnItemClick(View v, int position) {
                v.findViewById(R.id.checkbox).setBackgroundResource(R.drawable.gift_cheek);
                if (lastView != null) {
                    lastView.findViewById(R.id.checkbox).setBackgroundResource(R.drawable.white);
                }
                lastView = v;
            }
        });
        poPuGridAdapter2.setOnItem(new PoPuGridAdapter.OnItemClick() {
            @Override
            public void setOnItemClick(View v, int position) {
                v.findViewById(R.id.checkbox).setBackgroundResource(R.drawable.gift_cheek);
                if (lastView != null) {
                    lastView.findViewById(R.id.checkbox).setBackgroundResource(R.drawable.white);
                }
                lastView = v;
            }
        });
        poPuGridAdapter3.setOnItem(new PoPuGridAdapter.OnItemClick() {
            @Override
            public void setOnItemClick(View v, int position) {
                v.findViewById(R.id.checkbox).setBackgroundResource(R.drawable.gift_cheek);
                if (lastView != null) {
                    lastView.findViewById(R.id.checkbox).setBackgroundResource(R.drawable.white);
                }
                lastView = v;
            }
        });
    }


    private void initSendGiftPoPu() {
        View view = getLayoutInflater().inflate(R.layout.click, null);
        TextView click_1314 = view.findViewById(R.id.click_1314);
        TextView click_666 = view.findViewById(R.id.click_666);
        TextView click_21 = view.findViewById(R.id.click_21);
        TextView click_1 = view.findViewById(R.id.click_1);
        click_1314.setOnClickListener(this);
        click_1.setOnClickListener(this);
        click_666.setOnClickListener(this);
        click_21.setOnClickListener(this);
        PopupWindow mPopup = new PopupWindow(this);
        //加载一个视图模板
        mPopup.setContentView(view);
        //给他设置高度和宽度
        mPopup.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);
        mPopup.setWidth(ViewGroup.LayoutParams.WRAP_CONTENT);
        mPopup.setFocusable(true);
        //设置处理Popup其他地方能点击 通过两个方法相辅相成才能实现这个跟Android模拟机的版本有关
        mPopup.setOutsideTouchable(true);
        //在java代码里写一些组件的颜色背景 Android提供一个可以把16进制色值的参数转成Android可以识别值
        mPopup.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ffffff")));
        mPopup.showAtLocation(findViewById(R.id.start_live_gift), Gravity.BOTTOM, 290, 80);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.popup_gift_send:

                break;
            case R.id.popup_recharge:

                break;
            case R.id.popup_gift_count:
                initSendGiftPoPu();
                break;
            case R.id.click_1314:
                popup_gift_count.setText("1314");
                break;
            case R.id.click_666:
                popup_gift_count.setText("666");
                break;
            case R.id.click_21:
                popup_gift_count.setText("21");
                break;
            case R.id.click_1:
                popup_gift_count.setText("1");
                break;
        }

    }

}

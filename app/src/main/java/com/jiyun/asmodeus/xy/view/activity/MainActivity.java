package com.jiyun.asmodeus.xy.view.activity;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.jiyun.asmodeus.xy.R;
import com.jiyun.asmodeus.xy.model.entity.UserBean;
import com.jiyun.asmodeus.xy.model.utils.SharedPreferencesUtils;
import com.jiyun.asmodeus.xy.view.base.BaseActivity;
import com.jiyun.asmodeus.xy.view.fragments.FoundFragment;
import com.jiyun.asmodeus.xy.view.fragments.LiveFragment;
import com.jiyun.asmodeus.xy.view.fragments.MyselfFragment;
import com.jiyun.asmodeus.xy.view.fragments.RadioFragment;

import java.io.Serializable;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {


    @BindView(R.id.fragmentcontainer)
    FrameLayout fragmentcontainer;
    @BindView(R.id.Live)
    RelativeLayout Live;
    @BindView(R.id.Radio)
    RelativeLayout Radio;
    @BindView(R.id.OPENLive)
    RelativeLayout OPENLive;
    @BindView(R.id.Found)
    RelativeLayout Found;
    @BindView(R.id.Myself)
    RelativeLayout Myself;
    @BindView(R.id.liveimg)
    ImageView liveimg;
    @BindView(R.id.Radioimg)
    ImageView Radioimg;
    @BindView(R.id.Foundimg)
    ImageView Foundimg;
    @BindView(R.id.Myselfimg)
    ImageView Myselfimg;



    public static void start(Context activity) {
        Intent intent = new Intent(activity, MainActivity.class);
        activity.startActivity(intent);

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {
        setContentView(LiveFragment.class);
        setLiveimg();

    }

    @Override
    protected void initView() {

    }


    @OnClick({R.id.Live, R.id.Radio, R.id.OPENLive, R.id.Found, R.id.Myself})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.Live:
                setLiveimg();
                setContentView(LiveFragment.class);
                break;
            case R.id.Radio:
                setRadioimg();
                setContentView(RadioFragment.class);

                break;
            case R.id.OPENLive:
                setLiveOpenImg();
                startActivity(new Intent(this,OpenLiveActivity.class));
                break;
            case R.id.Found:
                setContentView(FoundFragment.class);
                setFoundImg();
                break;
            case R.id.Myself:
                setContentView(MyselfFragment.class);
                setmyselfimg();
                break;
        }
    }

    private void setmyselfimg() {
        liveimg.setImageResource(R.mipmap.icon_home_live_false);
        Radioimg.setImageResource(R.mipmap.icon_home_video_false);
        Foundimg.setImageResource(R.mipmap.icon_home_find_false);
        Myselfimg.setImageResource(R.mipmap.icon_home_mind_true);
    }

    private void setFoundImg() {
        liveimg.setImageResource(R.mipmap.icon_home_live_false);
        Radioimg.setImageResource(R.mipmap.icon_home_video_false);
        Foundimg.setImageResource(R.mipmap.icon_home_find_true);
        Myselfimg.setImageResource(R.mipmap.icon_home_mind_false);
    }

    private void setLiveOpenImg() {
        liveimg.setImageResource(R.mipmap.icon_home_live_false);
        Radioimg.setImageResource(R.mipmap.icon_home_video_false);
        Foundimg.setImageResource(R.mipmap.icon_home_find_false);
        Myselfimg.setImageResource(R.mipmap.icon_home_mind_false);
    }

    private void setRadioimg() {
        liveimg.setImageResource(R.mipmap.icon_home_live_false);
        Radioimg.setImageResource(R.mipmap.icon_home_video_true);
        Foundimg.setImageResource(R.mipmap.icon_home_find_false);
        Myselfimg.setImageResource(R.mipmap.icon_home_mind_false);
    }

    private void setLiveimg() {
        liveimg.setImageResource(R.mipmap.icon_home_live_true);
        Radioimg.setImageResource(R.mipmap.icon_home_video_false);
        Foundimg.setImageResource(R.mipmap.icon_home_find_false);
        Myselfimg.setImageResource(R.mipmap.icon_home_mind_false);
    }


}

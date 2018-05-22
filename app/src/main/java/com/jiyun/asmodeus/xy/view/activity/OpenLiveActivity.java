package com.jiyun.asmodeus.xy.view.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.jiyun.asmodeus.xy.App;
import com.jiyun.asmodeus.xy.R;
import com.jiyun.asmodeus.xy.view.adapter.OpenLiveAdapter;
import com.jiyun.asmodeus.xy.view.base.BaseActivity;
import com.jiyun.asmodeus.xy.view.base.BaseFragment;
import com.jiyun.asmodeus.xy.view.fragments.OpenLiveChallengeFragment;
import com.jiyun.asmodeus.xy.view.fragments.OpenLiveFreeFragment;
import com.tencent.rtmp.TXLivePushConfig;
import com.tencent.rtmp.TXLivePusher;
import com.tencent.rtmp.ui.TXCloudVideoView;


import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;

public class OpenLiveActivity extends BaseActivity {


    @BindView(R.id.loudVideoView)
    TXCloudVideoView loudVideoView;
    @BindView(R.id.tabLayout)
    TabLayout tabLayout;
    @BindView(R.id.viewPager)
    ViewPager viewPager;
    private ArrayList<BaseFragment> fragments;
    private ArrayList<String> title;

    private TXLivePushConfig mLivePushConfig;

    public TXLivePushConfig getmLivePushConfig() {
        return mLivePushConfig;
    }

    public TXLivePusher getmLivePusher() {
        return mLivePusher;
    }

    private TXLivePusher mLivePusher;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_open_live;
    }

    @Override
    protected void initData() {
        title = new ArrayList<>();
        fragments = new ArrayList<>();
        title.add("自由播");
        title.add("挑战");
        fragments.add(new OpenLiveFreeFragment());
        fragments.add(new OpenLiveChallengeFragment());

    }

    @Override
    protected void initView() {
        initPusher();
        OpenLiveAdapter openLiveAdapter = new OpenLiveAdapter(getSupportFragmentManager(), fragments, title);
        viewPager.setAdapter(openLiveAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }

    private void initPusher() {
        mLivePusher = new TXLivePusher(App.context);
        mLivePushConfig = new TXLivePushConfig();
        mLivePusher.setConfig(mLivePushConfig);
        mLivePusher.startCameraPreview(loudVideoView);
    }



}

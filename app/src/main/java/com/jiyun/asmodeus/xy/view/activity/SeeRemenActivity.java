package com.jiyun.asmodeus.xy.view.activity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jiyun.asmodeus.xy.R;
import com.jiyun.asmodeus.xy.contract.IGiftContract;
import com.jiyun.asmodeus.xy.model.entity.ReMenBean;
import com.jiyun.asmodeus.xy.view.base.BaseActivity;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.ui.TXCloudVideoView;

import butterknife.BindView;
import butterknife.OnClick;


public class SeeRemenActivity extends BaseActivity implements IGiftContract.Presenter{


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
    public static void start(Activity activity, ReMenBean.DataBean.ListBean listBean) {
        Intent intent = new Intent(activity, SeeRemenActivity .class);
        intent.putExtra("ReMenlistBean",listBean);
        activity.startActivity(intent);
    }
    @Override
    protected int getLayoutId() {
        return R.layout.activity_start_live;
    }

    @Override
    protected void initData() {
        ReMenBean.DataBean.ListBean listBean= (ReMenBean.DataBean.ListBean) getIntent().getSerializableExtra("ReMenlistBean");
        Glide.with(this).load(listBean.getCover()).into(startLiveIcon);
        startLiveNickname.setText(listBean.getNickName());
        startLiveOnLineCount.setText("在线人数："+listBean.getViewNum());
        startLiveLiveNo.setText(String.valueOf(listBean.getLiveId()));
        startLiveSwitch.setVisibility(View.GONE);
        //创建 player 对象
        mLivePlayer = new TXLivePlayer(this);
        //关键 player 对象与界面 view
        mLivePlayer.setPlayerView(startLiveVideoView);
        String flvUrl =  listBean.getHlsPullUrl();
        mLivePlayer.startPlay(flvUrl, TXLivePlayer.PLAY_TYPE_LIVE_FLV);
    }

    @Override
    protected void initView() {

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

                break;
        }
    }

    @Override
    public void GetGift() {

    }
}

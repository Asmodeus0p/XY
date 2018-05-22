package com.jiyun.asmodeus.xy.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jiyun.asmodeus.xy.App;
import com.jiyun.asmodeus.xy.R;
import com.jiyun.asmodeus.xy.contract.IStartLiveContract;
import com.jiyun.asmodeus.xy.model.entity.CreateRoomBean;
import com.jiyun.asmodeus.xy.model.utils.SharedPreferencesUtils;
import com.jiyun.asmodeus.xy.presenter.StartLivePresenter;
import com.jiyun.asmodeus.xy.view.base.BaseActivity;
import com.tencent.rtmp.TXLivePushConfig;
import com.tencent.rtmp.TXLivePusher;
import com.tencent.rtmp.ui.TXCloudVideoView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class StartLiveActivity extends BaseActivity implements IStartLiveContract.View {

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
    private TXLivePusher mLivePusher;
    private TXLivePushConfig mLivePushConfig;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_start_live;
    }

    @Override
    protected void initData() {
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        CreateRoomBean createRoomBean = (CreateRoomBean) intent.getSerializableExtra("createRoomBean");
        String cover = createRoomBean.getData().getCover();
        String pushUrl = createRoomBean.getData().getPushUrl();
        String liveNo = createRoomBean.getData().getLiveNo();
        int liveId = createRoomBean.getData().getLiveId();
        startLiveLiveNo.setText(String.valueOf(liveId));
        Glide.with(this).load(cover).into(startLiveIcon);
        mLivePusher = new TXLivePusher(App.context);
        mLivePushConfig = new TXLivePushConfig();
        mLivePusher.setConfig(mLivePushConfig);
        mLivePusher.startPusher(pushUrl);
        mLivePusher.startCameraPreview(startLiveVideoView);
        // 默认是前置摄像头
        mLivePusher.switchCamera();
        String USERNO = (String) SharedPreferencesUtils.getParam(App.context, "USERNO", "asdf");
        StartLivePresenter startLivePresenter = new StartLivePresenter(this);
        startLivePresenter.startLive(liveNo, cover, name, USERNO);

    }

    //结束推流，注意做好清理工作
    public void stopRtmpPublish() {
        mLivePusher.stopCameraPreview(true); //停止摄像头预览
        mLivePusher.stopPusher();            //停止推流
        mLivePusher.setPushListener(null);   //解绑 listener
    }

    @Override
    protected void initView() {

    }

    @Override
    public void showStartLiveMessage(String string) {
        Log.e("========", string);
    }


    @OnClick({R.id.start_live_finish, R.id.start_live_music, R.id.start_live_message, R.id.start_live_switch, R.id.start_live_gift})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.start_live_finish:
                stopRtmpPublish();
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
}

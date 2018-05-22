package com.jiyun.asmodeus.xy.view.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jiyun.asmodeus.xy.R;
import com.jiyun.asmodeus.xy.contract.IMyselfContract;
import com.jiyun.asmodeus.xy.model.entity.UserInfoBean;
import com.jiyun.asmodeus.xy.presenter.MyselfPresenter;
import com.jiyun.asmodeus.xy.view.activity.Meself_MessageActivity;
import com.jiyun.asmodeus.xy.view.activity.SettingActivity;
import com.jiyun.asmodeus.xy.view.base.BaseFragment;
import com.makeramen.roundedimageview.RoundedImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class MyselfFragment extends BaseFragment implements IMyselfContract.View {


    @BindView(R.id.Myself_setting)
    ImageView MyselfSetting;
    @BindView(R.id.Myself_Head_portrait)
    RoundedImageView MyselfHeadPortrait;
    @BindView(R.id.Myself_UserName)
    TextView MyselfUserName;
    @BindView(R.id.Myself_goUserImg)
    ImageView MyselfGoUserImg;
    @BindView(R.id.Myself_message)
    RelativeLayout MyselfMessage;
    @BindView(R.id.text)
    TextView text;
    @BindView(R.id.Myself_follow)
    TextView MyselfFollow;
    @BindView(R.id.text1)
    TextView text1;
    @BindView(R.id.Myself_fans)
    TextView MyselfFans;
    @BindView(R.id.Myself_chat)
    RelativeLayout MyselfChat;
    @BindView(R.id.Myself_privilege)
    RelativeLayout MyselfPrivilege;
    @BindView(R.id.Myself_wallet)
    RelativeLayout MyselfWallet;
    @BindView(R.id.Myself_video)
    RelativeLayout MyselfVideo;
    @BindView(R.id.Myself_help)
    RelativeLayout MyselfHelp;
    @BindView(R.id.Myself_fanst)
    RelativeLayout MyselfFanst;
    private UserInfoBean s;


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_myself;
    }

    @Override
    protected void init() {

    }

    @Override
    protected void loadDatas() {
        IMyselfContract.Presenter presenter = new MyselfPresenter(this);
        presenter.requestUserInfoBean();
    }

    @Override
    public void LoadUserInfoBean(UserInfoBean userInfoBean) {
        s = userInfoBean;
        MyselfFollow.setText(userInfoBean.getData().getFollowNum()+"");
        MyselfFans.setText(userInfoBean.getData().getFollowerSize()+"");
        MyselfUserName.setText(userInfoBean.getData().getNickName());
        Glide.with(this).load(userInfoBean.getData().getAvatar()).into(MyselfHeadPortrait);


    }




    @OnClick({R.id.Myself_setting, R.id.Myself_message, R.id.Myself_chat, R.id.Myself_privilege, R.id.Myself_wallet, R.id.Myself_video, R.id.Myself_help, R.id.Myself_fanst})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.Myself_setting:
                startActivity(new Intent(getActivity(), SettingActivity.class));
                break;
            case R.id.Myself_message:
                Meself_MessageActivity.start(getActivity(),s);
                break;
            case R.id.Myself_chat:
                break;
            case R.id.Myself_privilege:
                break;
            case R.id.Myself_wallet:
                break;
            case R.id.Myself_video:
                break;
            case R.id.Myself_help:
                break;
            case R.id.Myself_fanst:
                break;
        }
    }
}

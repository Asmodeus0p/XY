package com.jiyun.asmodeus.xy.view.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jiyun.asmodeus.xy.R;
import com.jiyun.asmodeus.xy.view.activity.Meself_MessageActivity;
import com.jiyun.asmodeus.xy.view.base.BaseFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class UserinfoPersonalFragment extends BaseFragment {


    @BindView(R.id.userinfo_personal_name)
    TextView userinfoPersonalName;
    @BindView(R.id.userinfo_personal_sex)
    TextView userinfoPersonalSex;
    @BindView(R.id.userinfo_personal_birthday)
    TextView userinfoPersonalBirthday;
    @BindView(R.id.userinfo_personal_place)
    TextView userinfoPersonalPlace;
    @BindView(R.id.userinfo_personal_personal)
    TextView userinfoPersonalPersonal;
    @BindView(R.id.userinfo_personal_roomid)
    TextView userinfoPersonalRoomid;
    @BindView(R.id.userinfo_personal_YXid)
    TextView userinfoPersonalYXid;
    @BindView(R.id.userinfo_personal_grade)
    TextView userinfoPersonalGrade;
    @BindView(R.id.userinfo_personal_integral)
    TextView userinfoPersonalIntegral;


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_userinfo_personal;
    }

    @Override
    protected void init() {
        userinfoPersonalName.setText(((Meself_MessageActivity) getActivity()).userInfoBean.getData().getNickName());
        userinfoPersonalBirthday.setText(((Meself_MessageActivity) getActivity()).userInfoBean.getData().getBirthday());



    }

    @Override
    protected void loadDatas() {

    }


}

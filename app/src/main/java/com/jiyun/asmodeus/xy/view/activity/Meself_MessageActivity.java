package com.jiyun.asmodeus.xy.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jiyun.asmodeus.xy.R;
import com.jiyun.asmodeus.xy.model.entity.UserInfoBean;
import com.jiyun.asmodeus.xy.view.adapter.OpenLiveAdapter;
import com.jiyun.asmodeus.xy.view.base.BaseActivity;
import com.jiyun.asmodeus.xy.view.base.BaseFragment;
import com.jiyun.asmodeus.xy.view.fragments.UserinfoPersonalFragment;
import com.jiyun.asmodeus.xy.view.fragments.UserinfoWorksFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Meself_MessageActivity extends BaseActivity {
    @BindView(R.id.imageView4)
    ImageView imageView4;
    @BindView(R.id.userinf_break)
    ImageView userinfBreak;
    @BindView(R.id.textView4)
    TextView textView4;
    @BindView(R.id.userinf_bianji)
    ImageView userinfBianji;
    @BindView(R.id.userinfo_headImage)
    ImageView userinfoHeadImage;
    @BindView(R.id.imageView11)
    ImageView imageView11;
    @BindView(R.id.imageView12)
    ImageView imageView12;
    @BindView(R.id.userinfo_name)
    TextView userinfoName;
    @BindView(R.id.userinfo_sex)
    ImageView userinfoSex;
    @BindView(R.id.userinfo_age)
    TextView userinfoAge;
    @BindView(R.id.imageView14)
    ImageView imageView14;
    @BindView(R.id.userinfo_follow)
    TextView userinfoFollow;
    @BindView(R.id.userinfo_fans)
    TextView userinfoFans;
    @BindView(R.id.textView11)
    TextView textView11;
    @BindView(R.id.userinfo_tab)
    TabLayout userinfoTab;
    @BindView(R.id.userinf_viewpager)
    ViewPager userinfViewpager;
    public UserInfoBean userInfoBean;

    public static void start(Context activity, UserInfoBean userInfoBean) {
        Intent intent = new Intent(activity, Meself_MessageActivity.class);
        intent.putExtra("userInfoBean", userInfoBean);
        activity.startActivity(intent);
    }


    @Override
    protected int getLayoutId() {
        return R.layout.activity_meself__message;
    }

    @Override
    protected void initData() {
        userInfoBean = (UserInfoBean) getIntent().getSerializableExtra("userInfoBean");
        userinfoName.setText(userInfoBean.getData().getNickName());
        userinfoAge.setText(userInfoBean.getData().getBirthday());
        Glide.with(this).load(userInfoBean.getData().getCover()).into(userinfoHeadImage);
        userinfoFans.setText("粉丝:" + userInfoBean.getData().getFollowerSize());
        userinfoFollow.setText("关注:" + userInfoBean.getData().getFollowNum());
        ArrayList<String> titles = new ArrayList<>();
        titles.add("作品");
        titles.add("资料");
        ArrayList<BaseFragment> fragments = new ArrayList<>();
        fragments.add(new UserinfoWorksFragment());
        fragments.add(new UserinfoPersonalFragment());
        OpenLiveAdapter openLiveAdapter = new OpenLiveAdapter(getSupportFragmentManager(), fragments, titles);
        userinfViewpager.setAdapter(openLiveAdapter);
        userinfoTab.setupWithViewPager(userinfViewpager);

    }

    @Override
    protected void initView() {

    }


    @OnClick({R.id.userinf_break, R.id.userinf_bianji})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.userinf_break:
                finish();
                break;
            case R.id.userinf_bianji:
                break;
        }
    }
}

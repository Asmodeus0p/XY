package com.jiyun.asmodeus.xy.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.jiyun.asmodeus.xy.App;
import com.jiyun.asmodeus.xy.R;
import com.jiyun.asmodeus.xy.view.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SettingActivity extends BaseActivity  {

    @BindView(R.id.setting_back)
    ImageView settingBack;
    @BindView(R.id.setting_Account_security)
    TextView settingAccountSecurity;
    @BindView(R.id.Scavenging_caching)
    TextView ScavengingCaching;
    @BindView(R.id.setting_about)
    TextView settingAbout;
    @BindView(R.id.setting_Contact_us)
    TextView settingContactUs;
    @BindView(R.id.setting_Score_for_me)
    TextView settingScoreForMe;
    @BindView(R.id.setting_Sign_out)
    TextView settingSignOut;


    @Override
    protected int getLayoutId() {
        return R.layout.activity_setting;
    }

    @Override
    protected void initData() {
        ButterKnife.bind(this);
    }

    @Override
    protected void initView() {

    }

    @OnClick({R.id.setting_back, R.id.setting_Account_security, R.id.Scavenging_caching, R.id.setting_about, R.id.setting_Contact_us, R.id.setting_Score_for_me, R.id.setting_Sign_out})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.setting_back:
                finish();
                break;
            case R.id.setting_Account_security:
                break;
            case R.id.Scavenging_caching:
                break;
            case R.id.setting_about:
                break;
            case R.id.setting_Contact_us:
                break;
            case R.id.setting_Score_for_me:
                break;
            case R.id.setting_Sign_out:
                break;
        }
    }


}

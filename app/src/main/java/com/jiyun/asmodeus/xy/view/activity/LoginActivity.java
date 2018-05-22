package com.jiyun.asmodeus.xy.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.jiyun.asmodeus.xy.R;
import com.jiyun.asmodeus.xy.contract.ILoginContract;
import com.jiyun.asmodeus.xy.model.entity.UserBean;
import com.jiyun.asmodeus.xy.model.http.MyNetworkCallback;
import com.jiyun.asmodeus.xy.model.http.OkHttpUtils;
import com.jiyun.asmodeus.xy.model.utils.SharedPreferencesUtils;
import com.jiyun.asmodeus.xy.presenter.LoginPresenter;
import com.jiyun.asmodeus.xy.view.base.BaseActivity;

import java.text.SimpleDateFormat;
import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity implements ILoginContract.View {

    @BindView(R.id.back)
    ImageView back;
    @BindView(R.id.setting)
    ImageView setting;
    @BindView(R.id.UserName)
    EditText UserName;
    @BindView(R.id.PassWord)
    EditText PassWord;
    @BindView(R.id.forgetPassword)
    TextView forgetPassword;
    @BindView(R.id.LoginWechat)
    ImageView LoginWechat;
    @BindView(R.id.LoginQQ)
    ImageView LoginQQ;
    @BindView(R.id.LoginPhone)
    ImageView LoginPhone;
    @BindView(R.id.register)
    TextView register;
    @BindView(R.id.Login_login)
    Button LoginLogin;


    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void initData() {
        boolean login = (boolean) SharedPreferencesUtils.getParam(this, "IsLogin", false);
        if (login) {
            startActivity(new Intent(this, MainActivity.class));
            finish();
        }


    }

    @Override
    protected void initView() {

    }

    @OnClick({R.id.back, R.id.setting, R.id.forgetPassword, R.id.LoginWechat, R.id.LoginQQ, R.id.LoginPhone, R.id.register, R.id.Login_login})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.back:
                finish();
                break;
            case R.id.setting:
                startActivity(new Intent(this, SettingActivity.class));
                break;
            case R.id.forgetPassword:


                break;
            case R.id.LoginWechat:

                break;
            case R.id.LoginQQ:


                break;
            case R.id.LoginPhone:
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
                break;
            case R.id.register:
                startActivity(new Intent(this, RegisterActivity.class));
                break;
            case R.id.Login_login:
                ILoginContract.Presenter presenter = new LoginPresenter(this);
                presenter.requestUserBean(UserName.getText().toString().trim(), PassWord.getText().toString().trim());
                break;
        }


    }

    @Override
    public void LoadUserBean(UserBean userBean) {
        if (userBean.getCode().equals("200")) {
            SharedPreferencesUtils.setParam(LoginActivity.this, "IsLogin", true);
            String timeStamp = String.valueOf(System.currentTimeMillis());
            SharedPreferencesUtils.setParam(this, "APPTAKEN", userBean.getData().getToken());
            SharedPreferencesUtils.setTime(this,timeStamp);
            SharedPreferencesUtils.setParam(this, "USERNO", userBean.getData().getUserNo());
            MainActivity.start(LoginActivity.this);
            finish();
        } else {
            SharedPreferencesUtils.setParam(LoginActivity.this, "IsLogin", false);
        }
    }
}

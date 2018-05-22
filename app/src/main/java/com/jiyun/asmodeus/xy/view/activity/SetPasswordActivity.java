package com.jiyun.asmodeus.xy.view.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.jiyun.asmodeus.xy.App;
import com.jiyun.asmodeus.xy.R;
import com.jiyun.asmodeus.xy.contract.ISetPassWordContract;
import com.jiyun.asmodeus.xy.model.entity.UserBean;
import com.jiyun.asmodeus.xy.model.http.MyNetworkCallback;
import com.jiyun.asmodeus.xy.model.http.OkHttpUtils;
import com.jiyun.asmodeus.xy.model.utils.SharedPreferencesUtils;
import com.jiyun.asmodeus.xy.presenter.SetPassworkPresenter;
import com.jiyun.asmodeus.xy.view.base.BaseActivity;

import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SetPasswordActivity extends BaseActivity implements ISetPassWordContract.View {

    @BindView(R.id.set_password_back)
    ImageView setPasswordBack;
    @BindView(R.id.set_passwordEd)
    EditText setPasswordEd;
    @BindView(R.id.set_passwordlogin)
    Button setPasswordlogin;
    private String phoneNumber;
    private String code;


    public static void start(Context activity, String PhoneNumber, String Code) {
        Intent intent = new Intent(activity, SetPasswordActivity.class);
        intent.putExtra("PhoneNumber", PhoneNumber);
        intent.putExtra("Code", Code);
        activity.startActivity(intent);

    }


    @Override
    protected int getLayoutId() {
        return R.layout.activity_set_password;
    }

    @Override
    protected void initData() {
        ButterKnife.bind(this);
        phoneNumber = getIntent().getStringExtra("PhoneNumber");
        code = getIntent().getStringExtra("Code");
    }

    @Override
    protected void initView() {

    }

    @OnClick({R.id.set_password_back, R.id.set_passwordlogin})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.set_password_back:
                finish();
                break;
            case R.id.set_passwordlogin:
                ISetPassWordContract.Presenter presenter = new SetPassworkPresenter(this);
                presenter.requestUserCodeCategory(setPasswordEd.getText().toString().trim(), code, phoneNumber);

                break;
        }
    }

    @Override
    public void LoadUserCodeCategory(UserBean userBean) {
        if (userBean.getCode().equals("200")) {
            SharedPreferencesUtils.setParam(SetPasswordActivity.this, "IsLogin", true);
            MainActivity.start(SetPasswordActivity.this);
        }else{
            SharedPreferencesUtils.setParam(SetPasswordActivity.this, "IsLogin", false);
        }
    }
}

package com.jiyun.asmodeus.xy.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.jiyun.asmodeus.xy.App;
import com.jiyun.asmodeus.xy.R;
import com.jiyun.asmodeus.xy.contract.IRegisterContract;
import com.jiyun.asmodeus.xy.model.entity.UserCodeCategory;
import com.jiyun.asmodeus.xy.model.http.MyNetworkCallback;
import com.jiyun.asmodeus.xy.model.http.OkHttpUtils;
import com.jiyun.asmodeus.xy.presenter.RegisterPresenter;
import com.jiyun.asmodeus.xy.view.base.BaseActivity;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.OkHttpClient;

public class RegisterActivity extends BaseActivity implements IRegisterContract.View {


    @BindView(R.id.register_back)
    ImageView registerBack;
    @BindView(R.id.register_phone)
    EditText registerPhone;
    @BindView(R.id.register_Verification_Code_Edtext)
    EditText registerVerificationCodeEdtext;
    @BindView(R.id.register_Verification_Code)
    TextView registerVerificationCode;
    @BindView(R.id.register_Determine)
    Button registerDetermine;

    private String data;


    @Override
    protected int getLayoutId() {
        return R.layout.activity_register;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }


    @OnClick({R.id.register_back, R.id.register_Verification_Code, R.id.register_Determine})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.register_back:
                finish();
                break;
            case R.id.register_Verification_Code:
                IRegisterContract.Presenter presenter = new RegisterPresenter(this);
                presenter.requestUserCodeCategory(registerPhone.getText().toString().trim());
                break;
            case R.id.register_Determine:
                if (registerVerificationCodeEdtext.getText().toString().trim().isEmpty()) {
                    Toast.makeText(this, "验证码不能为空", Toast.LENGTH_SHORT).show();
                }
                if (registerVerificationCodeEdtext.getText().toString().trim().equals(data)) {
                    SetPasswordActivity.start(this, registerPhone.getText().toString().trim(), data);
                }
                break;
        }
    }


    @Override
    public void LoadUserCodeCategory(UserCodeCategory userCodeCategory) {

        data = userCodeCategory.getData();
        registerVerificationCodeEdtext.setText(data);
    }
}

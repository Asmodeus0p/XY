package com.jiyun.asmodeus.xy.presenter;

import com.jiyun.asmodeus.xy.contract.ILiveContract;
import com.jiyun.asmodeus.xy.contract.IMyselfContract;
import com.jiyun.asmodeus.xy.model.Interface.ILiveModel;
import com.jiyun.asmodeus.xy.model.Interface.IMyselfModel;

import com.jiyun.asmodeus.xy.model.biz.MyselfModel;
import com.jiyun.asmodeus.xy.model.entity.UserInfoBean;
import com.jiyun.asmodeus.xy.model.http.MyNetworkCallback;

public class MyselfPresenter implements IMyselfContract.Presenter {
    public IMyselfContract.View view;
    public IMyselfModel model;

    public MyselfPresenter(IMyselfContract.View view) {
        this.view = view;
        this.model = new MyselfModel();

    }

    @Override
    public void requestUserInfoBean() {
        model.getUserInfo(new MyNetworkCallback<UserInfoBean>() {
            @Override
            public void onError(String Message) {

            }

            @Override
            public void onSuccess(UserInfoBean data) {
                view.LoadUserInfoBean(data);
            }
        });
    }
}

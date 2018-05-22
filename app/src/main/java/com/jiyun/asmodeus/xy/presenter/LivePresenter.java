package com.jiyun.asmodeus.xy.presenter;


import com.jiyun.asmodeus.xy.contract.ILiveContract;
import com.jiyun.asmodeus.xy.model.Interface.ILiveModel;
import com.jiyun.asmodeus.xy.model.biz.LiveModel;
import com.jiyun.asmodeus.xy.model.entity.BannerBean;
import com.jiyun.asmodeus.xy.model.entity.ReMenBean;
import com.jiyun.asmodeus.xy.model.entity.RenqizhuboBean;
import com.jiyun.asmodeus.xy.model.http.MyNetworkCallback;

public class LivePresenter implements ILiveContract.Presenter {
    public ILiveContract.View view;
    public ILiveModel model;

    public LivePresenter(ILiveContract.View view) {
        this.view = view;
        this.model = new LiveModel();

    }

    @Override
    public void requestBannerBean() {
        model.getBanner(new MyNetworkCallback<BannerBean>() {
            @Override
            public void onError(String Message) {

            }

            @Override
            public void onSuccess(BannerBean data) {
                view.LoadBannerBean(data);
            }
        });
    }

    @Override
    public void requestRenqizhuBoBean() {
        model.getRenqizhubo(new MyNetworkCallback<RenqizhuboBean>() {
            @Override
            public void onError(String Message) {

            }

            @Override
            public void onSuccess(RenqizhuboBean data) {
                view.LoadRenqizhuBoBean(data);
            }
        });
    }

    @Override
    public void requestReMenBean() {
        model.getReMenBean(new MyNetworkCallback<ReMenBean>() {
            @Override
            public void onError(String Message) {

            }

            @Override
            public void onSuccess(ReMenBean data) {
                view.LoadReMenBean(data);
            }
        });
    }
}

package com.jiyun.asmodeus.xy.presenter;


import com.jiyun.asmodeus.xy.contract.IGiftContract;
import com.jiyun.asmodeus.xy.model.Interface.IGiftModel;
import com.jiyun.asmodeus.xy.model.biz.GiftModel;
import com.jiyun.asmodeus.xy.model.entity.GiftBean;
import com.jiyun.asmodeus.xy.model.http.MyNetworkCallback;

public class GiftPresenter implements IGiftContract.Presenter {
    public IGiftContract.View view;
    public IGiftModel model;

    public GiftPresenter(IGiftContract.View view) {
        this.view = view;
        this.model = new GiftModel();

    }


    @Override
    public void GetGift() {
        model.getReMenBean(new MyNetworkCallback<GiftBean>() {
            @Override
            public void onError(String Message) {

            }

            @Override
            public void onSuccess(GiftBean data) {
                view.showGift(data);
            }
        });
    }
}

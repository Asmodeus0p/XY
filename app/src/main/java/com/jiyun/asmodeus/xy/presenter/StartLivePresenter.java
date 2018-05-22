package com.jiyun.asmodeus.xy.presenter;

import com.jiyun.asmodeus.xy.contract.IStartLiveContract;
import com.jiyun.asmodeus.xy.model.Interface.IStartLiveModel;
import com.jiyun.asmodeus.xy.model.biz.StartLiveModel;
import com.jiyun.asmodeus.xy.model.entity.StartLiveBean;
import com.jiyun.asmodeus.xy.model.http.MyNetworkCallback;

public class StartLivePresenter implements IStartLiveContract.Presenter {

    private IStartLiveModel iStartLiveModel;
    private IStartLiveContract.View view;

    public StartLivePresenter(IStartLiveContract.View view) {
        iStartLiveModel = new StartLiveModel();
        this.view = view;
    }

    @Override
    public void startLive(String liveNo, String cover, String name, String userNo) {
        iStartLiveModel.startLive(new MyNetworkCallback<StartLiveBean>() {
            @Override
            public void onError(String Message) {

            }

            @Override
            public void onSuccess(StartLiveBean data) {
                view.showStartLiveMessage(data.getMsg());
            }
        }, liveNo, cover, name, userNo);
    }
}

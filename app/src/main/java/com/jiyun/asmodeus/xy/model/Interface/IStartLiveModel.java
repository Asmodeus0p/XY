package com.jiyun.asmodeus.xy.model.Interface;

import com.jiyun.asmodeus.xy.model.entity.StartLiveBean;
import com.jiyun.asmodeus.xy.model.http.MyNetworkCallback;

public interface IStartLiveModel {

    void startLive(MyNetworkCallback<StartLiveBean> callback,String liveNo,String cover,String name,String userNo);
}

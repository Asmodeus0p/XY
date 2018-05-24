package com.jiyun.asmodeus.xy.model.Interface;

import com.jiyun.asmodeus.xy.model.entity.GiftBean;

import com.jiyun.asmodeus.xy.model.http.MyNetworkCallback;

public interface IGiftModel {
    void getGiftBean1(MyNetworkCallback<GiftBean> callback);

}

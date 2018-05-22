package com.jiyun.asmodeus.xy.model.biz;

import com.jiyun.asmodeus.xy.model.Interface.IGiftModel;
import com.jiyun.asmodeus.xy.model.entity.GiftBean;
import com.jiyun.asmodeus.xy.model.http.MyNetworkCallback;
import com.jiyun.asmodeus.xy.model.http.OkHttpUtils;
import com.jiyun.asmodeus.xy.model.utils.Urls;

public class GiftModel implements IGiftModel {
    @Override
    public void getReMenBean(MyNetworkCallback<GiftBean> callback) {
        OkHttpUtils.getInstance().doGet(Urls.LIVEGIFT,callback);
    }
}

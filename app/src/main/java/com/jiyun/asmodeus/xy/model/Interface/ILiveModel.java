package com.jiyun.asmodeus.xy.model.Interface;

import com.jiyun.asmodeus.xy.model.entity.BannerBean;
import com.jiyun.asmodeus.xy.model.entity.ReMenBean;
import com.jiyun.asmodeus.xy.model.entity.RenqizhuboBean;
import com.jiyun.asmodeus.xy.model.http.MyNetworkCallback;

public interface ILiveModel {
    void getBanner(MyNetworkCallback<BannerBean>callback);
    void getRenqizhubo(MyNetworkCallback<RenqizhuboBean>callback);
    void getReMenBean(MyNetworkCallback<ReMenBean>callback);

}

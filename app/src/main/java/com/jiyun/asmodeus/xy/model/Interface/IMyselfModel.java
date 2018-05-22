package com.jiyun.asmodeus.xy.model.Interface;

import com.jiyun.asmodeus.xy.model.entity.UserInfoBean;
import com.jiyun.asmodeus.xy.model.http.MyNetworkCallback;

public interface IMyselfModel {
    void getUserInfo(MyNetworkCallback<UserInfoBean> callback);
}

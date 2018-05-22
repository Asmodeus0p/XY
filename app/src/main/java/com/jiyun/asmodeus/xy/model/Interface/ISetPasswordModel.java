package com.jiyun.asmodeus.xy.model.Interface;

import com.jiyun.asmodeus.xy.model.entity.UserBean;
import com.jiyun.asmodeus.xy.model.http.MyNetworkCallback;


public interface ISetPasswordModel {
    void GetUSerBean(MyNetworkCallback<UserBean> callback , String phoneNumber, String captch, String password);
}

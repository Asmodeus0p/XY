package com.jiyun.asmodeus.xy.model.Interface;

import com.jiyun.asmodeus.xy.model.entity.UserBean;
import com.jiyun.asmodeus.xy.model.http.MyNetworkCallback;

import java.util.Map;

public interface ILoginModel {
    void getUserBean(MyNetworkCallback<UserBean> callback , String UserName,String Password);
}

package com.jiyun.asmodeus.xy.model.Interface;


import com.jiyun.asmodeus.xy.model.entity.UserCodeCategory;
import com.jiyun.asmodeus.xy.model.http.MyNetworkCallback;

public interface IRegisterModel {
    void UserCodeCategory(MyNetworkCallback<UserCodeCategory> callback , String Phone);
}

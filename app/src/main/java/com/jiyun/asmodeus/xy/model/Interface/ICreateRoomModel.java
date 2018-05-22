package com.jiyun.asmodeus.xy.model.Interface;

import com.jiyun.asmodeus.xy.model.entity.CreateRoomBean;
import com.jiyun.asmodeus.xy.model.http.MyNetworkCallback;

public interface ICreateRoomModel {
    void createRoom(MyNetworkCallback<CreateRoomBean> callback,String position,String name,String userNo);
}

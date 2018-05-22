package com.jiyun.asmodeus.xy.contract;

import com.jiyun.asmodeus.xy.model.entity.CreateRoomBean;
import com.jiyun.asmodeus.xy.model.http.MyNetworkCallback;

public interface ICreateRoomContract {

    interface View {
        void showCreateRoomData(CreateRoomBean createRoomBean);
    }

    interface Presenter {
        void createRoom(String position, String menuNo, String name, String userNo);
    }

}

package com.jiyun.asmodeus.xy.presenter;

import com.jiyun.asmodeus.xy.contract.ICreateRoomContract;
import com.jiyun.asmodeus.xy.model.Interface.ICreateRoomModel;
import com.jiyun.asmodeus.xy.model.biz.CreateRoomModel;
import com.jiyun.asmodeus.xy.model.entity.CreateRoomBean;
import com.jiyun.asmodeus.xy.model.http.MyNetworkCallback;

public class CreateRoomPresenter implements ICreateRoomContract.Presenter {

    private ICreateRoomModel iCreateRoomModel;
    private ICreateRoomContract.View view;

    public CreateRoomPresenter(ICreateRoomContract.View view) {
        iCreateRoomModel = new CreateRoomModel();
        this.view = view;
    }

    @Override
    public void createRoom(String position, String menuNo, String name, String userNo) {
        iCreateRoomModel.createRoom(new MyNetworkCallback<CreateRoomBean>() {
            @Override
            public void onError(String Message) {

            }

            @Override
            public void onSuccess(CreateRoomBean data) {
                view.showCreateRoomData(data);
            }
        }, position, name, userNo);
    }
}

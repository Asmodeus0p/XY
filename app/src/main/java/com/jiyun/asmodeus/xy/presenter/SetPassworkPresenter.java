package com.jiyun.asmodeus.xy.presenter;


import com.jiyun.asmodeus.xy.contract.ISetPassWordContract;
import com.jiyun.asmodeus.xy.model.Interface.ISetPasswordModel;
import com.jiyun.asmodeus.xy.model.biz.SetPassWordModel;
import com.jiyun.asmodeus.xy.model.entity.UserBean;
import com.jiyun.asmodeus.xy.model.http.MyNetworkCallback;

public class SetPassworkPresenter implements ISetPassWordContract.Presenter {

    public ISetPassWordContract.View view;
    public ISetPasswordModel iSetPasswordModel;

    public SetPassworkPresenter(ISetPassWordContract.View  view) {
        this.view =view;
        this.iSetPasswordModel = new SetPassWordModel() ;

    }

    @Override
    public void requestUserCodeCategory(String phoneNumber, String captch, String password) {
        iSetPasswordModel.GetUSerBean(new MyNetworkCallback<UserBean>() {
            @Override
            public void onError(String Message) {

            }

            @Override
            public void onSuccess(UserBean data) {
                view.LoadUserCodeCategory(data);
            }
        },phoneNumber,captch,password);
    }
}

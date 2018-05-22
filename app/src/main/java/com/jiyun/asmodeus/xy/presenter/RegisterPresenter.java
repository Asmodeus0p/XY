package com.jiyun.asmodeus.xy.presenter;
import com.jiyun.asmodeus.xy.contract.IRegisterContract;
import com.jiyun.asmodeus.xy.model.Interface.IRegisterModel;
import com.jiyun.asmodeus.xy.model.biz.RegisterModel;
import com.jiyun.asmodeus.xy.model.entity.UserCodeCategory;
import com.jiyun.asmodeus.xy.model.http.MyNetworkCallback;
public class RegisterPresenter implements IRegisterContract.Presenter {

    public IRegisterContract.View iloginview;
    public IRegisterModel iRegisterModel;

    public RegisterPresenter(IRegisterContract.View  iloginview) {
        this.iloginview =iloginview;
        this.iRegisterModel = new RegisterModel() ;

    }

    @Override
    public void requestUserCodeCategory(String Phone) {
        iRegisterModel.UserCodeCategory(new MyNetworkCallback<UserCodeCategory>() {
            @Override
            public void onError(String Message) {

            }

            @Override
            public void onSuccess(UserCodeCategory data) {
                    iloginview.LoadUserCodeCategory(data);
            }
        },Phone);
    }
}

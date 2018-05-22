package com.jiyun.asmodeus.xy.presenter;

import com.jiyun.asmodeus.xy.contract.ILoginContract;
import com.jiyun.asmodeus.xy.model.Interface.ILoginModel;
import com.jiyun.asmodeus.xy.model.biz.LoginModel;
import com.jiyun.asmodeus.xy.model.entity.UserBean;
import com.jiyun.asmodeus.xy.model.http.MyNetworkCallback;



public class LoginPresenter implements ILoginContract.Presenter {
      public ILoginContract.View iloginview;
          public ILoginModel iLoginModel;

          public LoginPresenter(ILoginContract.View  iloginview) {
              this.iloginview =iloginview;
              this.iLoginModel = new LoginModel() ;

          }

    @Override
    public void requestUserBean(String UserName, String Password) {

              iLoginModel.getUserBean(new MyNetworkCallback<UserBean>() {
                  @Override
                  public void onError(String Message) {

                  }

                  @Override
                  public void onSuccess(UserBean data) {
                      iloginview.LoadUserBean(data);
                  }
              },UserName,Password);
    }
}

package com.jiyun.asmodeus.xy.contract;

import com.jiyun.asmodeus.xy.model.entity.UserBean;

public interface ILoginContract {
    interface Presenter{
            void requestUserBean(String UserName,String Password);
    }
    interface View{
            void LoadUserBean(UserBean userBean);
    }
}

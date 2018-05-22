package com.jiyun.asmodeus.xy.contract;


import com.jiyun.asmodeus.xy.model.entity.UserInfoBean;

public interface IMyselfContract {
    interface Presenter{
        void requestUserInfoBean();
    }
    interface View{
        void LoadUserInfoBean(UserInfoBean userInfoBean);
    }
}

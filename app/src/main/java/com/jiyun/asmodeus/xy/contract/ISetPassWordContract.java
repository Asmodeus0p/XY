package com.jiyun.asmodeus.xy.contract;

import com.jiyun.asmodeus.xy.model.entity.UserBean;
import com.jiyun.asmodeus.xy.model.entity.UserCodeCategory;

public interface ISetPassWordContract {
    interface Presenter{
        void requestUserCodeCategory(String phoneNumber, String captch, String password);
    }
    interface View{
        void LoadUserCodeCategory(UserBean userBean);
    }
}

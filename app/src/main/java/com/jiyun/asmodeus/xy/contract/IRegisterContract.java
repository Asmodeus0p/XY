package com.jiyun.asmodeus.xy.contract;



import com.jiyun.asmodeus.xy.model.entity.UserBean;
import com.jiyun.asmodeus.xy.model.entity.UserCodeCategory;

public interface IRegisterContract {
    interface Presenter{
        void requestUserCodeCategory(String Phone);
    }
    interface View{
        void LoadUserCodeCategory(UserCodeCategory userCodeCategory);
    }
}

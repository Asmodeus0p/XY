package com.jiyun.asmodeus.xy.contract;

import com.jiyun.asmodeus.xy.model.entity.BannerBean;
import com.jiyun.asmodeus.xy.model.entity.ReMenBean;
import com.jiyun.asmodeus.xy.model.entity.RenqizhuboBean;
import com.jiyun.asmodeus.xy.model.entity.UserBean;

public interface ILiveContract {
    interface Presenter{
        void requestBannerBean();
        void requestRenqizhuBoBean();
        void requestReMenBean();

    }
    interface View{
        void LoadBannerBean(BannerBean bannerBean);
        void LoadRenqizhuBoBean(RenqizhuboBean renqizhuboBean);
        void LoadReMenBean(ReMenBean reMenBean);
    }
}

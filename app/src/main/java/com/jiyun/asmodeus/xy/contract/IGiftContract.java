package com.jiyun.asmodeus.xy.contract;
import com.jiyun.asmodeus.xy.model.entity.GiftBean;
public interface IGiftContract {
    interface View {
        void showGift(GiftBean createRoomBean);
    }
    interface Presenter {
        void GetGift();
    }
}

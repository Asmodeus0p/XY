package com.jiyun.asmodeus.xy.contract;

public interface IStartLiveContract {


    interface View {
        void showStartLiveMessage(String string);
    }

    interface Presenter {
        void startLive(String liveNo, String cover, String name, String userNo);
    }
}

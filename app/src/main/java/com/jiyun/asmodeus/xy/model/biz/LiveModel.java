package com.jiyun.asmodeus.xy.model.biz;

import com.jiyun.asmodeus.xy.App;
import com.jiyun.asmodeus.xy.model.Interface.ILiveModel;
import com.jiyun.asmodeus.xy.model.entity.BannerBean;
import com.jiyun.asmodeus.xy.model.entity.ReMenBean;
import com.jiyun.asmodeus.xy.model.entity.RenqizhuboBean;
import com.jiyun.asmodeus.xy.model.http.MyNetworkCallback;
import com.jiyun.asmodeus.xy.model.http.OkHttpUtils;
import com.jiyun.asmodeus.xy.model.utils.DecodeUtils;
import com.jiyun.asmodeus.xy.model.utils.SharedPreferencesUtils;
import com.jiyun.asmodeus.xy.model.utils.Urls;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public class LiveModel implements ILiveModel {


    @Override
    public void getBanner(MyNetworkCallback<BannerBean> callback) {

        OkHttpUtils.getInstance().doGet(Urls.LIVEBANNER, callback);
    }

    @Override
    public void getRenqizhubo(MyNetworkCallback<RenqizhuboBean> callback) {


        OkHttpUtils.getInstance().doGet(Urls.LIVERENQIZHUBO, callback);
    }

    @Override
    public void getReMenBean(MyNetworkCallback<ReMenBean> callback) {
        OkHttpUtils.getInstance().doGet(Urls.LIVEREMEN, callback);
    }
}

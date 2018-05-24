package com.jiyun.asmodeus.xy.model.biz;

import com.jiyun.asmodeus.xy.model.Interface.IGiftModel;
import com.jiyun.asmodeus.xy.model.entity.GiftBean;
import com.jiyun.asmodeus.xy.model.http.MyNetworkCallback;
import com.jiyun.asmodeus.xy.model.http.OkHttpUtils;
import com.jiyun.asmodeus.xy.model.utils.Urls;

import java.util.HashMap;
import java.util.Map;

public class GiftModel implements IGiftModel {
    @Override
    public void getGiftBean1(MyNetworkCallback<GiftBean> callback) {
        Map<String,String> map = new HashMap<>();
        map.put("length","18");
        OkHttpUtils.getInstance().doGet(Urls.LIVEGIFT,map,callback);
    }


}

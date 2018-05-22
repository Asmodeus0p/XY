package com.jiyun.asmodeus.xy.model.biz;

import com.jiyun.asmodeus.xy.model.Interface.IStartLiveModel;
import com.jiyun.asmodeus.xy.model.entity.StartLiveBean;
import com.jiyun.asmodeus.xy.model.http.MyNetworkCallback;
import com.jiyun.asmodeus.xy.model.http.OkHttpUtils;
import com.jiyun.asmodeus.xy.model.utils.DecodeUtils;

import java.util.HashMap;
import java.util.Map;

public class StartLiveModel implements IStartLiveModel {

    @Override
    public void startLive(MyNetworkCallback<StartLiveBean> callback, String liveNo, String cover, String name, String userNo) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("liveNo", liveNo);
        hashMap.put("cover", cover);
        hashMap.put("name", name);
        String sign = DecodeUtils.getSign(hashMap);
        Map<String, String> map = new HashMap<>();
        map.put("userNo", userNo);
        map.put("sign", sign);
        OkHttpUtils.getInstance().doPost("http://cx.connxun.com/cx-api/live/startLive", hashMap, map, callback);
    }
}

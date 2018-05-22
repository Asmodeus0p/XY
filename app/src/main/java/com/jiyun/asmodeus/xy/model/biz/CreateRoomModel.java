package com.jiyun.asmodeus.xy.model.biz;

import com.jiyun.asmodeus.xy.model.Interface.ICreateRoomModel;
import com.jiyun.asmodeus.xy.model.entity.CreateRoomBean;
import com.jiyun.asmodeus.xy.model.http.MyNetworkCallback;
import com.jiyun.asmodeus.xy.model.http.OkHttpUtils;
import com.jiyun.asmodeus.xy.model.utils.DecodeUtils;

import java.util.HashMap;
import java.util.Map;

public class CreateRoomModel implements ICreateRoomModel {
    @Override
    public void createRoom(MyNetworkCallback<CreateRoomBean> callback, String position, String name, String userNo) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("position", position);
        hashMap.put("menuNo", "1");
        hashMap.put("name", name);
        String sign = DecodeUtils.getSign(hashMap);
        Map<String, String> map = new HashMap<>();
        map.put("userNo", userNo);
        map.put("sign", sign);
        OkHttpUtils.getInstance().doPost("http://cx.connxun.com/cx-api/live/openQcloudLive", hashMap, map, callback);
    }
}

package com.jiyun.asmodeus.xy.model.biz;


import com.jiyun.asmodeus.xy.App;
import com.jiyun.asmodeus.xy.model.Interface.IMyselfModel;
import com.jiyun.asmodeus.xy.model.entity.UserInfoBean;
import com.jiyun.asmodeus.xy.model.http.MyNetworkCallback;
import com.jiyun.asmodeus.xy.model.http.OkHttpUtils;
import com.jiyun.asmodeus.xy.model.utils.DecodeUtils;
import com.jiyun.asmodeus.xy.model.utils.SharedPreferencesUtils;
import com.jiyun.asmodeus.xy.model.utils.Urls;

import java.util.HashMap;
import java.util.Map;

public class MyselfModel implements IMyselfModel {
    @Override
    public void getUserInfo(MyNetworkCallback<UserInfoBean> callback) {
        HashMap<String, String> map = new HashMap<>();
        final String time = SharedPreferencesUtils.getTime(App.context);
        map.put("time", time+"");
        Map<String, String> map1 = new HashMap<>();
        String USERNO = (String) SharedPreferencesUtils.getParam(App.context, "USERNO", "asdf");
        String encrypt = DecodeUtils.getSign(map);
        map1.put("userNo",USERNO);
        map1.put("sign",encrypt);
        OkHttpUtils.getInstance().doPost(Urls.USERINFO, map,map1, callback);
    }
}

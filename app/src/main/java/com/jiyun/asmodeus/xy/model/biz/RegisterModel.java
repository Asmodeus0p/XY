package com.jiyun.asmodeus.xy.model.biz;

import com.jiyun.asmodeus.xy.model.Interface.IRegisterModel;
import com.jiyun.asmodeus.xy.model.entity.UserCodeCategory;
import com.jiyun.asmodeus.xy.model.http.MyNetworkCallback;
import com.jiyun.asmodeus.xy.model.http.OkHttpUtils;
import com.jiyun.asmodeus.xy.model.utils.Urls;

import java.util.HashMap;

public class RegisterModel implements IRegisterModel {
    @Override
    public void UserCodeCategory(MyNetworkCallback<UserCodeCategory> callback, String Phone) {
        HashMap<String, String> map = new HashMap<>();
        map.put("phone",Phone);

        OkHttpUtils.getInstance().doPost(Urls.REGISTERURLS,map,callback);
    }
}

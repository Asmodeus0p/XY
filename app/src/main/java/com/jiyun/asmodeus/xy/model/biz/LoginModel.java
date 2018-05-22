package com.jiyun.asmodeus.xy.model.biz;

import com.jiyun.asmodeus.xy.model.Interface.ILoginModel;
import com.jiyun.asmodeus.xy.model.entity.UserBean;
import com.jiyun.asmodeus.xy.model.http.MyNetworkCallback;
import com.jiyun.asmodeus.xy.model.http.OkHttpUtils;
import com.jiyun.asmodeus.xy.model.utils.Urls;

import java.util.HashMap;
import java.util.Map;

public class LoginModel implements ILoginModel {


    @Override
    public void getUserBean(MyNetworkCallback<UserBean> callback, String UserName, String Password) {
         HashMap<String, String> map = new HashMap<>();
         map.put("phone",UserName);
        map.put("password",Password);
        OkHttpUtils.getInstance().doPost(Urls.LOGINURLS,map,callback);
    }
}

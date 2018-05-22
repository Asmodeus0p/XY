package com.jiyun.asmodeus.xy.model.biz;

import com.jiyun.asmodeus.xy.model.Interface.ISetPasswordModel;
import com.jiyun.asmodeus.xy.model.entity.UserBean;
import com.jiyun.asmodeus.xy.model.entity.UserCodeCategory;
import com.jiyun.asmodeus.xy.model.http.MyNetworkCallback;
import com.jiyun.asmodeus.xy.model.http.OkHttpUtils;
import com.jiyun.asmodeus.xy.model.utils.Urls;

import java.util.HashMap;

public class SetPassWordModel implements ISetPasswordModel {
    @Override
    public void GetUSerBean(MyNetworkCallback<UserBean> callback, String phoneNumber, String captch, String password) {
        HashMap<String, String> map = new HashMap<>();
        map.put("phone",phoneNumber);
        map.put("captch",captch);
        map.put("password",password);
        OkHttpUtils.getInstance().doPost(Urls.SETPASSWORD,map,callback);

    }
}

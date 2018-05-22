package com.jiyun.asmodeus.xy.model.utils;

import android.text.TextUtils;
import android.util.Log;

import com.jiyun.asmodeus.xy.App;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class DecodeUtils {
    //ASCLL编码排序
    public static String AscllMap(HashMap map) {
        Collection<String> keyset = map.keySet();

        List list = new ArrayList<String>(keyset);

        Collections.sort(list);
        //这种打印出的字符串顺序和微信官网提供的字典序顺序是一致的
        String stringBuilder = new String();
        for (int i = 0; i < list.size(); i++) {
            stringBuilder = stringBuilder + list.get(i) + "=" + map.get(list.get(i)) + "&";
        }

        return stringBuilder.substring(0, stringBuilder.length() - 1);
    }

    /**
     * 计算字符串的 MD5 值
     *
     * @param plaintext 明文
     * @return 密文
     */
    public static String encrypt(String plaintext) {
        if (TextUtils.isEmpty(plaintext)) {
            return "";
        }
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] bytes = md5.digest(plaintext.getBytes());
            String result = "";
            for (byte b : bytes) {
                String temp = Integer.toHexString(b & 0xff);
                if (temp.length() == 1) {
                    temp = "0" + temp;
                }
                result += temp;
            }
            return result;

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }
    public static String getSign(HashMap<String, String> hashMap) {
        String ascllString = AscllMap(hashMap);
        String sign = ascllString + "&key=" + SharedPreferencesUtils.getParam(App.context,"APPTAKEN","asd");
        String newSign = null;
        try {
            newSign = encrypt(sign).toUpperCase();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return newSign;
    }
}

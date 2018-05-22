package com.jiyun.asmodeus.xy.model.http;

import android.media.Image;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.jiyun.asmodeus.xy.App;
import com.jiyun.asmodeus.xy.model.utils.DecodeUtils;
import com.jiyun.asmodeus.xy.model.utils.SharedPreferencesUtils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.http2.Header;


public class OkHttpUtils {

    /**
     * 单例设计模式
     * 1、构造函数私有化
     * 2、提供一个公有的、静态、返回值类型是当前类的对象的方法
     */
    private static OkHttpUtils okHttpUtils;
    private OkHttpClient okHttpClient;//单例OKhttpClient对象的好处：1、避免重复创建销毁对象造成内存开销 2、OKhttp的高并发的优点没有被发挥出来

    private OkHttpUtils() {
        okHttpClient = new OkHttpClient.Builder().build();
    }

    /**
     * 懒汉式
     *
     * @return
     */
    public static OkHttpUtils getInstance() {
        if (okHttpUtils == null)
            okHttpUtils = new OkHttpUtils();
        return okHttpUtils;
    }


    /**
     * 无参的get请求
     *
     * @param url 接口地址
     */
    public void doGet(String url, final MyNetworkCallback callback) {


        Request request = new Request.Builder().url(url).build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                callback.onError(e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                final String result = response.body().string();
                App.context.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        callback.onSuccess(parseData(result, callback));
                    }
                });
            }
        });
    }

    /**
     * 有参的get请求
     *
     * @param url    接口地址
     * @param params 参数列表
     */
    public void doGet(String url, Map<String, String> params, final MyNetworkCallback callback) {

        //做非空判断 增强程序的健壮性
        if (params != null && params.size() > 0) {

            //获取map集合中所有key
            Set<String> keys = params.keySet();
            StringBuffer sb = new StringBuffer(url);
//            url = url + "?";
            sb.append("?");
            //遍历所有key
            for (String key : keys) {
                String value = params.get(key);
//                url = url + key + "=" + value + "&";
                sb.append(key).append("=").append(value).append("&");
            }

            url = sb.deleteCharAt(sb.length() - 1).toString();


        }

        Request request = new Request.Builder().url(url).build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                callback.onError(e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String result = response.body().string();
                App.context.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        callback.onSuccess(parseData(result, callback));
                    }
                });
            }
        });

    }


    /**
     * 有参的get请求
     *
     * @param url    接口地址
     * @param params 参数列表
     */
    public void doPost(String url, Map<String, String> params, Map<String, String> Heads, final MyNetworkCallback callback) {
        FormBody.Builder builder = new FormBody.Builder();
        if (params != null && params.size() > 0) {
            Set<String> keySet = params.keySet();
            for (String key : keySet) {
                String value = params.get(key);
                builder.add(key, value);

            }
        }
        FormBody formBody = builder.build();

        Request.Builder builder1 = new Request.Builder();
        builder1.url(url);
        builder1.post(formBody);
        if (Heads != null && Heads.size() > 0) {
            Set<String> keySet = Heads.keySet();
            for (String key : keySet) {
                String value = Heads.get(key);
                builder1.addHeader(key, value);

            }
        }

        Request request = builder1.build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                callback.onError(e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String result = response.body().string();
                App.context.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        callback.onSuccess(parseData(result, callback));
                    }
                });
            }
        });

    }

    public void doPost(String url, Map<String, String> params, final MyNetworkCallback callback) {
        FormBody.Builder builder = new FormBody.Builder();
        if (params != null && params.size() > 0) {
            Set<String> keySet = params.keySet();
            for (String key : keySet) {
                String value = params.get(key);
                builder.add(key, value);

            }
        }
        FormBody formBody = builder.build();

        Request.Builder builder1 = new Request.Builder();
        builder1.url(url);
        builder1.post(formBody);


        Request request = builder1.build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                callback.onError(e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String result = response.body().string();
                App.context.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        callback.onSuccess(parseData(result, callback));
                    }
                });
            }
        });

    }

    private <T> T parseData(String json, MyNetworkCallback<T> call) {
        Type[] interfaces = call.getClass().getGenericInterfaces();
        Type[] arguments = ((ParameterizedType) interfaces[0]).getActualTypeArguments();
        Gson gson = new Gson();
        T t = gson.fromJson(json, arguments[0]);
        return t;
    }
}

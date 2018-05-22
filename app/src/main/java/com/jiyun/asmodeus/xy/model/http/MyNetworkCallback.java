package com.jiyun.asmodeus.xy.model.http;

public interface MyNetworkCallback <T>{
    void onError(String Message);
    void onSuccess(T data);
}

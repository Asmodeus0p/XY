package com.jiyun.asmodeus.xy.model.entity;

public class StartLiveBean {

    /**
     * ext :
     * msg : 操作成功
     * code : 200
     * data : {"giftTotal":0}
     */

    private String ext;
    private String msg;
    private String code;
    /**
     * giftTotal : 0
     */

    private DataBean data;

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private int giftTotal;

        public int getGiftTotal() {
            return giftTotal;
        }

        public void setGiftTotal(int giftTotal) {
            this.giftTotal = giftTotal;
        }
    }
}

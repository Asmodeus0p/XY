package com.jiyun.asmodeus.xy.model.entity;

import java.io.Serializable;

public class CreateRoomBean implements Serializable{

    /**
     * ext :
     * msg : 操作成功
     * code : 200
     * data : {"cover":"http://art.nos-eastchina1.126.net/108.png","httpPullUrl":"rtmp://22048.liveplay.myqcloud.com/live/22048_418000012165775360.m3u8","hlsPullUrl":"rtmp://22048.liveplay.myqcloud.com/live/22048_418000012165775360.flv","pushUrl":"rtmp://22048.livepush.myqcloud.com/live/22048_418000012165775360?bizid=22048&txSecret=42a631c4f3e38b5d4a5138799745dc5e&txTime=5ABE67AD","menuNo":1,"rtmpPullUrl":"rtmp://22048.liveplay.myqcloud.com/live/22048_418000012165775360","liveNo":"429287944872787968","userNo":"418000012165775360","position":100000,"liveId":10018,"roomid":22473177}
     */

    private String ext;
    private String msg;
    private String code;
    /**
     * cover : http://art.nos-eastchina1.126.net/108.png
     * httpPullUrl : rtmp://22048.liveplay.myqcloud.com/live/22048_418000012165775360.m3u8
     * hlsPullUrl : rtmp://22048.liveplay.myqcloud.com/live/22048_418000012165775360.flv
     * pushUrl : rtmp://22048.livepush.myqcloud.com/live/22048_418000012165775360?bizid=22048&txSecret=42a631c4f3e38b5d4a5138799745dc5e&txTime=5ABE67AD
     * menuNo : 1
     * rtmpPullUrl : rtmp://22048.liveplay.myqcloud.com/live/22048_418000012165775360
     * liveNo : 429287944872787968
     * userNo : 418000012165775360
     * position : 100000
     * liveId : 10018
     * roomid : 22473177
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

    public static class DataBean implements Serializable{
        private String cover;
        private String httpPullUrl;
        private String hlsPullUrl;
        private String pushUrl;
        private int menuNo;
        private String rtmpPullUrl;
        private String liveNo;
        private String userNo;
        private int position;
        private int liveId;
        private Long roomid;

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getHttpPullUrl() {
            return httpPullUrl;
        }

        public void setHttpPullUrl(String httpPullUrl) {
            this.httpPullUrl = httpPullUrl;
        }

        public String getHlsPullUrl() {
            return hlsPullUrl;
        }

        public void setHlsPullUrl(String hlsPullUrl) {
            this.hlsPullUrl = hlsPullUrl;
        }

        public String getPushUrl() {
            return pushUrl;
        }

        public void setPushUrl(String pushUrl) {
            this.pushUrl = pushUrl;
        }

        public int getMenuNo() {
            return menuNo;
        }

        public void setMenuNo(int menuNo) {
            this.menuNo = menuNo;
        }

        public String getRtmpPullUrl() {
            return rtmpPullUrl;
        }

        public void setRtmpPullUrl(String rtmpPullUrl) {
            this.rtmpPullUrl = rtmpPullUrl;
        }

        public String getLiveNo() {
            return liveNo;
        }

        public void setLiveNo(String liveNo) {
            this.liveNo = liveNo;
        }

        public String getUserNo() {
            return userNo;
        }

        public void setUserNo(String userNo) {
            this.userNo = userNo;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public int getLiveId() {
            return liveId;
        }

        public void setLiveId(int liveId) {
            this.liveId = liveId;
        }

        public Long getRoomid() {
            return roomid;
        }

        public void setRoomid(Long roomid) {
            this.roomid = roomid;
        }
    }
}

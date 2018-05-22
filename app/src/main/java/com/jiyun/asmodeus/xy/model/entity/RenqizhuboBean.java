package com.jiyun.asmodeus.xy.model.entity;

import java.io.Serializable;
import java.util.List;

public class RenqizhuboBean implements Serializable {

    /**
     * msg : 操作成功
     * ext :
     * code : 200
     * data : {"totalRow":3,"pageNumber":1,"firstPage":true,"lastPage":true,"totalPage":1,"pageSize":10,"list":[{"birthday":"1997-02-09","hlsPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_444438511651651584.flv","rtmpPullUrl":"rtmp://22048.liveplay.myqcloud.com/live/22048_444438511651651584","nickName":"哲","liveNo":"448144808532246528","userNo":"444438511651651584","sex":1,"avatar":"http://art.nos-eastchina1.126.net/Screenshot_20180511-095054.jpg","liveId":10149,"roomid":444438511651651600,"cover":"http://art.nos-eastchina1.126.net/IMG_20180514_143914.jpg","httpPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_444438511651651584.m3u8","viewNum":0,"pushUrl":"rtmp://22048.livepush.myqcloud.com/live/22048_444438511651651584?bizid=22048&txSecret=481196e2735468b2e2b368e22e29d547&txTime=5B030180&liveNo=448144808532246528","name":"随便玩会","position":"郑州市"},{"birthday":"2018-02-26","hlsPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_443889203835568128.flv","rtmpPullUrl":"rtmp://22048.liveplay.myqcloud.com/live/22048_443889203835568128","nickName":"讨喜","liveNo":"448143087940665344","userNo":"443889203835568128","sex":2,"avatar":"http://art.nos-eastchina1.126.net/img-cb49d1ab8c7b5222d6f0bb838ea35b86.jpg","liveId":10125,"roomid":443889203835568100,"cover":"http://art.nos-eastchina1.126.net/img-cf3d9a0bf5ecee94cb5cbfc94e1b6e90.jpg","httpPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_443889203835568128.m3u8","viewNum":0,"pushUrl":"rtmp://22048.livepush.myqcloud.com/live/22048_443889203835568128?bizid=22048&txSecret=e093dc936da3e3d145f51903ffcd4281&txTime=5B02FFE6&liveNo=448143087940665344","name":"写作业ing","position":"郑州市"},{"birthday":"2018-05-15","hlsPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_445973560133943296.flv","rtmpPullUrl":"rtmp://22048.liveplay.myqcloud.com/live/22048_445973560133943296","nickName":"艺线42","liveNo":"448168340184104960","userNo":"445973560133943296","sex":1,"avatar":"http://art.nos-eastchina1.126.net/108.png","liveId":10196,"roomid":445973560133943300,"cover":"http://art.nos-eastchina1.126.net/108.png","httpPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_445973560133943296.m3u8","viewNum":0,"pushUrl":"rtmp://22048.livepush.myqcloud.com/live/22048_445973560133943296?bizid=22048&txSecret=9c056230919a5b37566628f90a2a830f&txTime=5B03176A&liveNo=448168340184104960","name":"aaa","position":"北京市"}]}
     */

    private String msg;
    private String ext;
    private String code;
    private DataBean data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
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

    public static class DataBean implements Serializable {
        /**
         * totalRow : 3
         * pageNumber : 1
         * firstPage : true
         * lastPage : true
         * totalPage : 1
         * pageSize : 10
         * list : [{"birthday":"1997-02-09","hlsPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_444438511651651584.flv","rtmpPullUrl":"rtmp://22048.liveplay.myqcloud.com/live/22048_444438511651651584","nickName":"哲","liveNo":"448144808532246528","userNo":"444438511651651584","sex":1,"avatar":"http://art.nos-eastchina1.126.net/Screenshot_20180511-095054.jpg","liveId":10149,"roomid":444438511651651600,"cover":"http://art.nos-eastchina1.126.net/IMG_20180514_143914.jpg","httpPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_444438511651651584.m3u8","viewNum":0,"pushUrl":"rtmp://22048.livepush.myqcloud.com/live/22048_444438511651651584?bizid=22048&txSecret=481196e2735468b2e2b368e22e29d547&txTime=5B030180&liveNo=448144808532246528","name":"随便玩会","position":"郑州市"},{"birthday":"2018-02-26","hlsPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_443889203835568128.flv","rtmpPullUrl":"rtmp://22048.liveplay.myqcloud.com/live/22048_443889203835568128","nickName":"讨喜","liveNo":"448143087940665344","userNo":"443889203835568128","sex":2,"avatar":"http://art.nos-eastchina1.126.net/img-cb49d1ab8c7b5222d6f0bb838ea35b86.jpg","liveId":10125,"roomid":443889203835568100,"cover":"http://art.nos-eastchina1.126.net/img-cf3d9a0bf5ecee94cb5cbfc94e1b6e90.jpg","httpPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_443889203835568128.m3u8","viewNum":0,"pushUrl":"rtmp://22048.livepush.myqcloud.com/live/22048_443889203835568128?bizid=22048&txSecret=e093dc936da3e3d145f51903ffcd4281&txTime=5B02FFE6&liveNo=448143087940665344","name":"写作业ing","position":"郑州市"},{"birthday":"2018-05-15","hlsPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_445973560133943296.flv","rtmpPullUrl":"rtmp://22048.liveplay.myqcloud.com/live/22048_445973560133943296","nickName":"艺线42","liveNo":"448168340184104960","userNo":"445973560133943296","sex":1,"avatar":"http://art.nos-eastchina1.126.net/108.png","liveId":10196,"roomid":445973560133943300,"cover":"http://art.nos-eastchina1.126.net/108.png","httpPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_445973560133943296.m3u8","viewNum":0,"pushUrl":"rtmp://22048.livepush.myqcloud.com/live/22048_445973560133943296?bizid=22048&txSecret=9c056230919a5b37566628f90a2a830f&txTime=5B03176A&liveNo=448168340184104960","name":"aaa","position":"北京市"}]
         */

        private int totalRow;
        private int pageNumber;
        private boolean firstPage;
        private boolean lastPage;
        private int totalPage;
        private int pageSize;
        private List<ListBean> list;

        public int getTotalRow() {
            return totalRow;
        }

        public void setTotalRow(int totalRow) {
            this.totalRow = totalRow;
        }

        public int getPageNumber() {
            return pageNumber;
        }

        public void setPageNumber(int pageNumber) {
            this.pageNumber = pageNumber;
        }

        public boolean isFirstPage() {
            return firstPage;
        }

        public void setFirstPage(boolean firstPage) {
            this.firstPage = firstPage;
        }

        public boolean isLastPage() {
            return lastPage;
        }

        public void setLastPage(boolean lastPage) {
            this.lastPage = lastPage;
        }

        public int getTotalPage() {
            return totalPage;
        }

        public void setTotalPage(int totalPage) {
            this.totalPage = totalPage;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean  implements Serializable{
            /**
             * birthday : 1997-02-09
             * hlsPullUrl : http://22048.liveplay.myqcloud.com/live/22048_444438511651651584.flv
             * rtmpPullUrl : rtmp://22048.liveplay.myqcloud.com/live/22048_444438511651651584
             * nickName : 哲
             * liveNo : 448144808532246528
             * userNo : 444438511651651584
             * sex : 1
             * avatar : http://art.nos-eastchina1.126.net/Screenshot_20180511-095054.jpg
             * liveId : 10149
             * roomid : 444438511651651600
             * cover : http://art.nos-eastchina1.126.net/IMG_20180514_143914.jpg
             * httpPullUrl : http://22048.liveplay.myqcloud.com/live/22048_444438511651651584.m3u8
             * viewNum : 0
             * pushUrl : rtmp://22048.livepush.myqcloud.com/live/22048_444438511651651584?bizid=22048&txSecret=481196e2735468b2e2b368e22e29d547&txTime=5B030180&liveNo=448144808532246528
             * name : 随便玩会
             * position : 郑州市
             */

            private String birthday;
            private String hlsPullUrl;
            private String rtmpPullUrl;
            private String nickName;
            private String liveNo;
            private String userNo;
            private int sex;
            private String avatar;
            private int liveId;
            private long roomid;
            private String cover;
            private String httpPullUrl;
            private int viewNum;
            private String pushUrl;
            private String name;
            private String position;

            public String getBirthday() {
                return birthday;
            }

            public void setBirthday(String birthday) {
                this.birthday = birthday;
            }

            public String getHlsPullUrl() {
                return hlsPullUrl;
            }

            public void setHlsPullUrl(String hlsPullUrl) {
                this.hlsPullUrl = hlsPullUrl;
            }

            public String getRtmpPullUrl() {
                return rtmpPullUrl;
            }

            public void setRtmpPullUrl(String rtmpPullUrl) {
                this.rtmpPullUrl = rtmpPullUrl;
            }

            public String getNickName() {
                return nickName;
            }

            public void setNickName(String nickName) {
                this.nickName = nickName;
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

            public int getSex() {
                return sex;
            }

            public void setSex(int sex) {
                this.sex = sex;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public int getLiveId() {
                return liveId;
            }

            public void setLiveId(int liveId) {
                this.liveId = liveId;
            }

            public long getRoomid() {
                return roomid;
            }

            public void setRoomid(long roomid) {
                this.roomid = roomid;
            }

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

            public int getViewNum() {
                return viewNum;
            }

            public void setViewNum(int viewNum) {
                this.viewNum = viewNum;
            }

            public String getPushUrl() {
                return pushUrl;
            }

            public void setPushUrl(String pushUrl) {
                this.pushUrl = pushUrl;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }
        }
    }
}

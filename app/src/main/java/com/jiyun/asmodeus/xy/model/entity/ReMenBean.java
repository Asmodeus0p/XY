package com.jiyun.asmodeus.xy.model.entity;

import java.io.Serializable;
import java.util.List;

public class ReMenBean implements Serializable {
    /**
     * ext :
     * msg : 操作成功
     * code : 200
     * data : {"totalRow":180,"pageNumber":1,"firstPage":true,"lastPage":false,"totalPage":18,"pageSize":10,"list":[{"birthday":"1997-02-09","hlsPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_444438511651651584.flv","rtmpPullUrl":"rtmp://22048.liveplay.myqcloud.com/live/22048_444438511651651584","nickName":"哲","liveNo":"448144808532246528","userNo":"444438511651651584","sex":1,"avatar":"http://art.nos-eastchina1.126.net/Screenshot_20180511-095054.jpg","liveId":10149,"roomid":444438511651651600,"cover":"http://art.nos-eastchina1.126.net/IMG_20180514_143914.jpg","httpPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_444438511651651584.m3u8","viewNum":0,"pushUrl":"rtmp://22048.livepush.myqcloud.com/live/22048_444438511651651584?bizid=22048&txSecret=481196e2735468b2e2b368e22e29d547&txTime=5B030180&liveNo=448144808532246528","name":"随便玩会","id":9083,"position":"郑州市","state":1},{"birthday":"2018-02-26","hlsPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_444026447204450304.flv","rtmpPullUrl":"rtmp://22048.liveplay.myqcloud.com/live/22048_444026447204450304","nickName":"呈呈呈","liveNo":"448169880538054656","userNo":"444026447204450304","sex":1,"avatar":"http://thirdqq.qlogo.cn/qqapp/1106665917/2C8E16756ED34236EDB99DFDA3D3E097/100","liveId":10128,"roomid":444026447204450300,"cover":"http://art.nos-eastchina1.126.net/53af216a32769207.png","httpPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_444026447204450304.m3u8","viewNum":0,"pushUrl":"rtmp://22048.livepush.myqcloud.com/live/22048_444026447204450304?bizid=22048&txSecret=afb0af5d938548741e0244a9af383698&txTime=5B0318DA&liveNo=448169880538054656","name":"打游戏","id":9186,"position":"临汾市","state":1},{"birthday":"2018-04-02","hlsPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_430427565102989312.flv","rtmpPullUrl":"rtmp://22048.liveplay.myqcloud.com/live/22048_430427565102989312","nickName":"888","liveNo":"431110270731943936","userNo":"430427565102989312","sex":1,"avatar":"http://art.nos-eastchina1.126.net/544417329.841182.jpeg","liveId":10003,"roomid":430427565102989300,"cover":"http://art.nos-eastchina1.126.net/108.png","httpPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_430427565102989312.m3u8","viewNum":0,"pushUrl":"rtmp://22048.livepush.myqcloud.com/live/22048_430427565102989312?bizid=22048&txSecret=15a6af325422fcb645520b80570c5551&txTime=5AC508DA&liveNo=431110270731943936","name":null,"id":4009,"position":"北京市","state":0},{"birthday":"1989-01-01","hlsPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_430427468764020736.flv","rtmpPullUrl":"rtmp://22048.liveplay.myqcloud.com/live/22048_430427468764020736","nickName":"三娣","liveNo":"431112495143321600","userNo":"430427468764020736","sex":2,"avatar":"http://art.nos-eastchina1.126.net/544673691.080357.jpeg","liveId":10002,"roomid":430427468764020740,"cover":"http://art.nos-eastchina1.126.net/108.png","httpPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_430427468764020736.m3u8","viewNum":0,"pushUrl":"rtmp://22048.livepush.myqcloud.com/live/22048_430427468764020736?bizid=22048&txSecret=d30a8468c91a9eec4c8f35890fd0d686&txTime=5AC50AEC&liveNo=431112495143321600","name":null,"id":4015,"position":"北京市","state":0},{"birthday":"1994-05-21","hlsPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_431031662072037376.flv","rtmpPullUrl":"rtmp://22048.liveplay.myqcloud.com/live/22048_431031662072037376","nickName":"和尚用飘柔","liveNo":"431117750690119680","userNo":"431031662072037376","sex":1,"avatar":"http://art.nos-eastchina1.126.net/544500386.535418.jpeg","liveId":10010,"roomid":431031662072037400,"cover":"http://art.nos-eastchina1.126.net/108.png","httpPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_431031662072037376.m3u8","viewNum":0,"pushUrl":"rtmp://22048.livepush.myqcloud.com/live/22048_431031662072037376?bizid=22048&txSecret=54e6657f6ef2ec9369676011c347b358&txTime=5AC50FD1&liveNo=431117750690119680","name":null,"id":4038,"position":"北京市","state":0},{"birthday":"2018-04-03","hlsPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_430730260200292352.flv","rtmpPullUrl":"rtmp://22048.liveplay.myqcloud.com/live/22048_430730260200292352","nickName":"艺线16","liveNo":"431147995421999104","userNo":"430730260200292352","sex":1,"avatar":"http://art.nos-eastchina1.126.net/108.png","liveId":10007,"roomid":430730260200292350,"cover":"http://art.nos-eastchina1.126.net/108.png","httpPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_430730260200292352.m3u8","viewNum":0,"pushUrl":"rtmp://22048.livepush.myqcloud.com/live/22048_430730260200292352?bizid=22048&txSecret=6e5e8bf2f531221a356d552b129d25f0&txTime=5AC52BFC&liveNo=431147995421999104","name":null,"id":4059,"position":"北京市","state":0},{"birthday":"1989-01-01","hlsPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_430425551304392704.flv","rtmpPullUrl":"rtmp://22048.liveplay.myqcloud.com/live/22048_430425551304392704","nickName":"Manfred","liveNo":"431542658746286080","userNo":"430425551304392704","sex":1,"avatar":"http://art.nos-eastchina1.126.net/545453789.173993.jpeg","liveId":10000,"roomid":430425551304392700,"cover":"http://art.nos-eastchina1.126.net/108.png","httpPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_430425551304392704.m3u8","viewNum":0,"pushUrl":"rtmp://22048.livepush.myqcloud.com/live/22048_430425551304392704?bizid=22048&txSecret=33518066ab69146b32b61c295a28297c&txTime=5AC69B8B&liveNo=431542658746286080","name":null,"id":4242,"position":"北京市","state":0},{"birthday":"2018-04-08","hlsPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_432579510399926272.flv","rtmpPullUrl":"rtmp://22048.liveplay.myqcloud.com/live/22048_432579510399926272","nickName":"小仙女","liveNo":"432580750869528576","userNo":"432579510399926272","sex":1,"avatar":"http://art.nos-eastchina1.126.net/548231087.289247.jpeg","liveId":10014,"roomid":432579510399926300,"cover":"http://art.nos-eastchina1.126.net/108.png","httpPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_432579510399926272.m3u8","viewNum":0,"pushUrl":"rtmp://22048.livepush.myqcloud.com/live/22048_432579510399926272?bizid=22048&txSecret=58cbb2d5647f6b4f95e7f9b4633f833c&txTime=5ACA6257&liveNo=432580750869528576","name":null,"id":4306,"position":"北京市","state":0},{"birthday":"2017-01-01","hlsPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_ 437973930049798144. flv","rtmpPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_ 437973930049798144","nickName":"默默","liveNo":"418880985086558208","userNo":"437973930049798144","sex":1,"avatar":"http://art.nos-eastchina1.126.net/tuijian04.jpeg","liveId":10068,"roomid":437973930049798140,"cover":"http://art.nos-eastchina1.126.net/tuijian04.jpeg","httpPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_ 437973930049798144.m3u8","viewNum":0,"pushUrl":"rtmp://p68ef2a85.live.126.net/live/98704cc24bd04307a11b128212a0adec?wsSecret=d50207824d8572431bf99978be7b7a68&wsTime=1519910609","name":"昨天","id":4320,"position":"北京市","state":0},{"birthday":"2017-01-01","hlsPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_ 437973782456434688. flv","rtmpPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_ 437973782456434688","nickName":"满天星","liveNo":"419061043046645760","userNo":"437973782456434688","sex":1,"avatar":"http://art.nos-eastchina1.126.net/tuijian03.jpeg","liveId":10067,"roomid":437973782456434700,"cover":"http://art.nos-eastchina1.126.net/tuijian03.jpeg","httpPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_ 437973782456434688.m3u8","viewNum":0,"pushUrl":"rtmp://p68ef2a85.live.126.net/live/330068755d1d4570a864dedc74e190e6?wsSecret=6f800b5d7cbd6a6954d96cfef73fe6e2&wsTime=1519953538","name":"沉默","id":4321,"position":null,"state":0}]}
     */

    private String ext;
    private String msg;
    private String code;
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

    public static class DataBean  implements Serializable{
        /**
         * totalRow : 180
         * pageNumber : 1
         * firstPage : true
         * lastPage : false
         * totalPage : 18
         * pageSize : 10
         * list : [{"birthday":"1997-02-09","hlsPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_444438511651651584.flv","rtmpPullUrl":"rtmp://22048.liveplay.myqcloud.com/live/22048_444438511651651584","nickName":"哲","liveNo":"448144808532246528","userNo":"444438511651651584","sex":1,"avatar":"http://art.nos-eastchina1.126.net/Screenshot_20180511-095054.jpg","liveId":10149,"roomid":444438511651651600,"cover":"http://art.nos-eastchina1.126.net/IMG_20180514_143914.jpg","httpPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_444438511651651584.m3u8","viewNum":0,"pushUrl":"rtmp://22048.livepush.myqcloud.com/live/22048_444438511651651584?bizid=22048&txSecret=481196e2735468b2e2b368e22e29d547&txTime=5B030180&liveNo=448144808532246528","name":"随便玩会","id":9083,"position":"郑州市","state":1},{"birthday":"2018-02-26","hlsPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_444026447204450304.flv","rtmpPullUrl":"rtmp://22048.liveplay.myqcloud.com/live/22048_444026447204450304","nickName":"呈呈呈","liveNo":"448169880538054656","userNo":"444026447204450304","sex":1,"avatar":"http://thirdqq.qlogo.cn/qqapp/1106665917/2C8E16756ED34236EDB99DFDA3D3E097/100","liveId":10128,"roomid":444026447204450300,"cover":"http://art.nos-eastchina1.126.net/53af216a32769207.png","httpPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_444026447204450304.m3u8","viewNum":0,"pushUrl":"rtmp://22048.livepush.myqcloud.com/live/22048_444026447204450304?bizid=22048&txSecret=afb0af5d938548741e0244a9af383698&txTime=5B0318DA&liveNo=448169880538054656","name":"打游戏","id":9186,"position":"临汾市","state":1},{"birthday":"2018-04-02","hlsPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_430427565102989312.flv","rtmpPullUrl":"rtmp://22048.liveplay.myqcloud.com/live/22048_430427565102989312","nickName":"888","liveNo":"431110270731943936","userNo":"430427565102989312","sex":1,"avatar":"http://art.nos-eastchina1.126.net/544417329.841182.jpeg","liveId":10003,"roomid":430427565102989300,"cover":"http://art.nos-eastchina1.126.net/108.png","httpPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_430427565102989312.m3u8","viewNum":0,"pushUrl":"rtmp://22048.livepush.myqcloud.com/live/22048_430427565102989312?bizid=22048&txSecret=15a6af325422fcb645520b80570c5551&txTime=5AC508DA&liveNo=431110270731943936","name":null,"id":4009,"position":"北京市","state":0},{"birthday":"1989-01-01","hlsPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_430427468764020736.flv","rtmpPullUrl":"rtmp://22048.liveplay.myqcloud.com/live/22048_430427468764020736","nickName":"三娣","liveNo":"431112495143321600","userNo":"430427468764020736","sex":2,"avatar":"http://art.nos-eastchina1.126.net/544673691.080357.jpeg","liveId":10002,"roomid":430427468764020740,"cover":"http://art.nos-eastchina1.126.net/108.png","httpPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_430427468764020736.m3u8","viewNum":0,"pushUrl":"rtmp://22048.livepush.myqcloud.com/live/22048_430427468764020736?bizid=22048&txSecret=d30a8468c91a9eec4c8f35890fd0d686&txTime=5AC50AEC&liveNo=431112495143321600","name":null,"id":4015,"position":"北京市","state":0},{"birthday":"1994-05-21","hlsPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_431031662072037376.flv","rtmpPullUrl":"rtmp://22048.liveplay.myqcloud.com/live/22048_431031662072037376","nickName":"和尚用飘柔","liveNo":"431117750690119680","userNo":"431031662072037376","sex":1,"avatar":"http://art.nos-eastchina1.126.net/544500386.535418.jpeg","liveId":10010,"roomid":431031662072037400,"cover":"http://art.nos-eastchina1.126.net/108.png","httpPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_431031662072037376.m3u8","viewNum":0,"pushUrl":"rtmp://22048.livepush.myqcloud.com/live/22048_431031662072037376?bizid=22048&txSecret=54e6657f6ef2ec9369676011c347b358&txTime=5AC50FD1&liveNo=431117750690119680","name":null,"id":4038,"position":"北京市","state":0},{"birthday":"2018-04-03","hlsPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_430730260200292352.flv","rtmpPullUrl":"rtmp://22048.liveplay.myqcloud.com/live/22048_430730260200292352","nickName":"艺线16","liveNo":"431147995421999104","userNo":"430730260200292352","sex":1,"avatar":"http://art.nos-eastchina1.126.net/108.png","liveId":10007,"roomid":430730260200292350,"cover":"http://art.nos-eastchina1.126.net/108.png","httpPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_430730260200292352.m3u8","viewNum":0,"pushUrl":"rtmp://22048.livepush.myqcloud.com/live/22048_430730260200292352?bizid=22048&txSecret=6e5e8bf2f531221a356d552b129d25f0&txTime=5AC52BFC&liveNo=431147995421999104","name":null,"id":4059,"position":"北京市","state":0},{"birthday":"1989-01-01","hlsPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_430425551304392704.flv","rtmpPullUrl":"rtmp://22048.liveplay.myqcloud.com/live/22048_430425551304392704","nickName":"Manfred","liveNo":"431542658746286080","userNo":"430425551304392704","sex":1,"avatar":"http://art.nos-eastchina1.126.net/545453789.173993.jpeg","liveId":10000,"roomid":430425551304392700,"cover":"http://art.nos-eastchina1.126.net/108.png","httpPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_430425551304392704.m3u8","viewNum":0,"pushUrl":"rtmp://22048.livepush.myqcloud.com/live/22048_430425551304392704?bizid=22048&txSecret=33518066ab69146b32b61c295a28297c&txTime=5AC69B8B&liveNo=431542658746286080","name":null,"id":4242,"position":"北京市","state":0},{"birthday":"2018-04-08","hlsPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_432579510399926272.flv","rtmpPullUrl":"rtmp://22048.liveplay.myqcloud.com/live/22048_432579510399926272","nickName":"小仙女","liveNo":"432580750869528576","userNo":"432579510399926272","sex":1,"avatar":"http://art.nos-eastchina1.126.net/548231087.289247.jpeg","liveId":10014,"roomid":432579510399926300,"cover":"http://art.nos-eastchina1.126.net/108.png","httpPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_432579510399926272.m3u8","viewNum":0,"pushUrl":"rtmp://22048.livepush.myqcloud.com/live/22048_432579510399926272?bizid=22048&txSecret=58cbb2d5647f6b4f95e7f9b4633f833c&txTime=5ACA6257&liveNo=432580750869528576","name":null,"id":4306,"position":"北京市","state":0},{"birthday":"2017-01-01","hlsPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_ 437973930049798144. flv","rtmpPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_ 437973930049798144","nickName":"默默","liveNo":"418880985086558208","userNo":"437973930049798144","sex":1,"avatar":"http://art.nos-eastchina1.126.net/tuijian04.jpeg","liveId":10068,"roomid":437973930049798140,"cover":"http://art.nos-eastchina1.126.net/tuijian04.jpeg","httpPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_ 437973930049798144.m3u8","viewNum":0,"pushUrl":"rtmp://p68ef2a85.live.126.net/live/98704cc24bd04307a11b128212a0adec?wsSecret=d50207824d8572431bf99978be7b7a68&wsTime=1519910609","name":"昨天","id":4320,"position":"北京市","state":0},{"birthday":"2017-01-01","hlsPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_ 437973782456434688. flv","rtmpPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_ 437973782456434688","nickName":"满天星","liveNo":"419061043046645760","userNo":"437973782456434688","sex":1,"avatar":"http://art.nos-eastchina1.126.net/tuijian03.jpeg","liveId":10067,"roomid":437973782456434700,"cover":"http://art.nos-eastchina1.126.net/tuijian03.jpeg","httpPullUrl":"http://22048.liveplay.myqcloud.com/live/22048_ 437973782456434688.m3u8","viewNum":0,"pushUrl":"rtmp://p68ef2a85.live.126.net/live/330068755d1d4570a864dedc74e190e6?wsSecret=6f800b5d7cbd6a6954d96cfef73fe6e2&wsTime=1519953538","name":"沉默","id":4321,"position":null,"state":0}]
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

        public static class ListBean implements Serializable {
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
             * id : 9083
             * position : 郑州市
             * state : 1
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
            private int id;
            private String position;
            private int state;

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

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }

            public int getState() {
                return state;
            }

            public void setState(int state) {
                this.state = state;
            }
        }
    }
}

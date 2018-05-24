package com.jiyun.asmodeus.xy.model.entity;

public class IMGift {

    private int msgType;
    private long ts;
    private Data data;

    public int getMsgType() {
        return msgType;
    }

    public void setMsgType(int msgType) {
        this.msgType = msgType;
    }

    public long getTs(long l) {
        return ts;
    }

    public void setTs(long ts) {
        this.ts = ts;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public static class  Data{


        private int giftNo;
        private int giftNum;
        private String giftName;
        private String giftPic;
        private SendUser sendUser;
        private ReceiveUser receiveUser;

        public int getGiftNum() {
            return giftNum;
        }

        public void setGiftNum(int giftNum) {
            this.giftNum = giftNum;
        }

        public int getGiftNo() {
            return giftNo;
        }

        public void setGiftNo(int giftNo) {
            this.giftNo = giftNo;
        }

        public String getGiftName() {
            return giftName;
        }

        public void setGiftName(String giftName) {
            this.giftName = giftName;
        }

        public String getGiftPic() {
            return giftPic;
        }

        public void setGiftPic(String giftPic) {
            this.giftPic = giftPic;
        }

        public SendUser getSendUser() {
            return sendUser;
        }

        public void setSendUser(SendUser sendUser) {
            this.sendUser = sendUser;
        }

        public ReceiveUser getReceiveUser() {
            return receiveUser;
        }

        public void setReceiveUser(ReceiveUser receiveUser) {
            this.receiveUser = receiveUser;
        }

        public static class SendUser {
            private String userNo;
            private String nickName;
            private String avatar;

            public String getUserNo() {
                return userNo;
            }

            public void setUserNo(String userNo) {
                this.userNo = userNo;
            }

            public String getNickName() {
                return nickName;
            }

            public void setNickName(String nickName) {
                this.nickName = nickName;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            @Override
            public String toString() {
                return "SendUser{" +
                        "userNo='" + userNo + '\'' +
                        ", nickName='" + nickName + '\'' +
                        ", avatar='" + avatar + '\'' +
                        '}';
            }

        }

        public static class ReceiveUser {
            private String userNo;
            private String nickName;
            private String avatar;

            public String getUserNo() {
                return userNo;
            }

            public void setUserNo(String userNo) {
                this.userNo = userNo;
            }

            public String getNickName() {
                return nickName;
            }

            public void setNickName(String nickName) {
                this.nickName = nickName;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            @Override
            public String toString() {
                return "ReceiveUser{" +
                        "userNo='" + userNo + '\'' +
                        ", nickName='" + nickName + '\'' +
                        ", avatar='" + avatar + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "IMGift{" +
                    "giftNo=" + giftNo +
                    ", giftName='" + giftName + '\'' +
                    ", giftPic='" + giftPic + '\'' +
                    ", sendUser=" + sendUser +
                    ", receiveUser=" + receiveUser +
                    '}';
        }
    }



}

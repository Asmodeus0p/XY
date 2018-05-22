package com.jiyun.asmodeus.xy.model.entity;


import java.io.Serializable;

public class UserBean implements Serializable {

    /**
     * ext :
     * msg : 操作成功
     * code : 200
     * data : {"birthday":"2018-05-17","userCharm":0,"followerSize":0,"city":"110000","nickName":"艺线26","userNo":"446694745926795264","sex":1,"avatar":"http://art.nos-eastchina1.126.net/108.png","upgradeDate":"2018-05-17 15:25:27","liveId":10277,"roomid":446694745926795264,"usableBalance":0,"token":"446694749194158080","cover":"http://art.nos-eastchina1.126.net/108.png","password":"zse1234567","character":12,"ex":0,"userLever":0,"tel":"15209274771","userBalance":0,"userSig":"eJw1j11PgzAYRv8LtxotXT*oyS62RQxDoihz3pGOFqwEaKE4yOJ-Fwm7PedN3udcnOT5-Y5rrUTKbbpqhfPgAOd2xnLQqpUpz61sJ*xijCEAV6uErK3K1ewQIoQhijCDhDIMCVquOlVMOnqMd8EmWh2r3LwWTHT*TTWWcTLGpPM8Ww5nE0SHe9Dw9uktC48btd3X4CM8aHj67P0Xv2JijKIefH0bYHZmCMI9aU7Dj1tkyXm9vj4TZTq3-K9F01TqUQQXaVUl5wpIMHIZpAvnWdb0tU3tqOUc--sHP1VTEA__"}
     */

    private String ext;
    private String msg;
    private String code;
    /**
     * birthday : 2018-05-17
     * userCharm : 0
     * followerSize : 0
     * city : 110000
     * nickName : 艺线26
     * userNo : 446694745926795264
     * sex : 1
     * avatar : http://art.nos-eastchina1.126.net/108.png
     * upgradeDate : 2018-05-17 15:25:27
     * liveId : 10277
     * roomid : 446694745926795264
     * usableBalance : 0
     * token : 446694749194158080
     * cover : http://art.nos-eastchina1.126.net/108.png
     * password : zse1234567
     * character : 12
     * ex : 0
     * userLever : 0
     * tel : 15209274771
     * userBalance : 0
     * userSig : eJw1j11PgzAYRv8LtxotXT*oyS62RQxDoihz3pGOFqwEaKE4yOJ-Fwm7PedN3udcnOT5-Y5rrUTKbbpqhfPgAOd2xnLQqpUpz61sJ*xijCEAV6uErK3K1ewQIoQhijCDhDIMCVquOlVMOnqMd8EmWh2r3LwWTHT*TTWWcTLGpPM8Ww5nE0SHe9Dw9uktC48btd3X4CM8aHj67P0Xv2JijKIefH0bYHZmCMI9aU7Dj1tkyXm9vj4TZTq3-K9F01TqUQQXaVUl5wpIMHIZpAvnWdb0tU3tqOUc--sHP1VTEA__
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

    public static class DataBean implements Serializable {
        private String birthday;
        private int userCharm;
        private int followerSize;
        private String city;
        private String nickName;
        private String userNo;
        private int sex;
        private String avatar;
        private String upgradeDate;
        private int liveId;
        private long roomid;
        private int usableBalance;
        private String token;
        private String cover;
        private String password;
        private int character;
        private int ex;
        private int userLever;
        private String tel;
        private int userBalance;
        private String userSig;

        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public int getUserCharm() {
            return userCharm;
        }

        public void setUserCharm(int userCharm) {
            this.userCharm = userCharm;
        }

        public int getFollowerSize() {
            return followerSize;
        }

        public void setFollowerSize(int followerSize) {
            this.followerSize = followerSize;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getNickName() {
            return nickName;
        }

        public void setNickName(String nickName) {
            this.nickName = nickName;
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

        public String getUpgradeDate() {
            return upgradeDate;
        }

        public void setUpgradeDate(String upgradeDate) {
            this.upgradeDate = upgradeDate;
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

        public int getUsableBalance() {
            return usableBalance;
        }

        public void setUsableBalance(int usableBalance) {
            this.usableBalance = usableBalance;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public int getCharacter() {
            return character;
        }

        public void setCharacter(int character) {
            this.character = character;
        }

        public int getEx() {
            return ex;
        }

        public void setEx(int ex) {
            this.ex = ex;
        }

        public int getUserLever() {
            return userLever;
        }

        public void setUserLever(int userLever) {
            this.userLever = userLever;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }

        public int getUserBalance() {
            return userBalance;
        }

        public void setUserBalance(int userBalance) {
            this.userBalance = userBalance;
        }

        public String getUserSig() {
            return userSig;
        }

        public void setUserSig(String userSig) {
            this.userSig = userSig;
        }
    }
}

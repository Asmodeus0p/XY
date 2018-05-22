package com.jiyun.asmodeus.xy.model.entity;

import java.io.Serializable;

public class UserInfoBean  implements Serializable{

    /**
     * msg : 操作成功
     * ext :
     * code : 200
     * data : {"birthday":"2018-02-07","updateDate":"2018-02-22 15:57:17","followerSize":0,"signature":null,"city":"110000","userNo":"410865805467582464","registerType":0,"delFlag":0,"cover":"http://art.nos-eastchina1.126.net/108.png","uid":null,"password":"123456","wechart":null,"character":12,"weibo":null,"province":null,"userLever":0,"tel":"15011541997","sortNum":0,"id":78,"state":0,"userBalance":100000,"vip":0,"recommender":null,"createDate":"2018-02-07 18:34:01","qq":null,"area":null,"userCharm":0,"nickName":"艺线1","sex":1,"updateUser":null,"avatar":"http://art.nos-eastchina1.126.net/108.png","upgradeDate":"2018-03-11 15:22:48","liveId":10011,"usableBalance":100000,"followNum":0,"ex":0,"createUser":null,"userType":0,"username":null,"status":0}
     */

    private String msg;
    private String ext;
    private String code;
    /**
     * birthday : 2018-02-07
     * updateDate : 2018-02-22 15:57:17
     * followerSize : 0
     * signature : null
     * city : 110000
     * userNo : 410865805467582464
     * registerType : 0
     * delFlag : 0
     * cover : http://art.nos-eastchina1.126.net/108.png
     * uid : null
     * password : 123456
     * wechart : null
     * character : 12
     * weibo : null
     * province : null
     * userLever : 0
     * tel : 15011541997
     * sortNum : 0
     * id : 78
     * state : 0
     * userBalance : 100000
     * vip : 0
     * recommender : null
     * createDate : 2018-02-07 18:34:01
     * qq : null
     * area : null
     * userCharm : 0
     * nickName : 艺线1
     * sex : 1
     * updateUser : null
     * avatar : http://art.nos-eastchina1.126.net/108.png
     * upgradeDate : 2018-03-11 15:22:48
     * liveId : 10011
     * usableBalance : 100000
     * followNum : 0
     * ex : 0
     * createUser : null
     * userType : 0
     * username : null
     * status : 0
     */

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
        private String birthday;
        private String updateDate;
        private int followerSize;
        private Object signature;
        private String city;
        private String userNo;
        private int registerType;
        private int delFlag;
        private String cover;
        private Object uid;
        private String password;
        private Object wechart;
        private int character;
        private Object weibo;
        private Object province;
        private int userLever;
        private String tel;
        private int sortNum;
        private int id;
        private int state;
        private int userBalance;
        private int vip;
        private Object recommender;
        private String createDate;
        private Object qq;
        private Object area;
        private int userCharm;
        private String nickName;
        private int sex;
        private Object updateUser;
        private String avatar;
        private String upgradeDate;
        private int liveId;
        private int usableBalance;
        private int followNum;
        private int ex;
        private Object createUser;
        private int userType;
        private Object username;
        private int status;

        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public String getUpdateDate() {
            return updateDate;
        }

        public void setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
        }

        public int getFollowerSize() {
            return followerSize;
        }

        public void setFollowerSize(int followerSize) {
            this.followerSize = followerSize;
        }

        public Object getSignature() {
            return signature;
        }

        public void setSignature(Object signature) {
            this.signature = signature;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getUserNo() {
            return userNo;
        }

        public void setUserNo(String userNo) {
            this.userNo = userNo;
        }

        public int getRegisterType() {
            return registerType;
        }

        public void setRegisterType(int registerType) {
            this.registerType = registerType;
        }

        public int getDelFlag() {
            return delFlag;
        }

        public void setDelFlag(int delFlag) {
            this.delFlag = delFlag;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public Object getUid() {
            return uid;
        }

        public void setUid(Object uid) {
            this.uid = uid;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Object getWechart() {
            return wechart;
        }

        public void setWechart(Object wechart) {
            this.wechart = wechart;
        }

        public int getCharacter() {
            return character;
        }

        public void setCharacter(int character) {
            this.character = character;
        }

        public Object getWeibo() {
            return weibo;
        }

        public void setWeibo(Object weibo) {
            this.weibo = weibo;
        }

        public Object getProvince() {
            return province;
        }

        public void setProvince(Object province) {
            this.province = province;
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

        public int getSortNum() {
            return sortNum;
        }

        public void setSortNum(int sortNum) {
            this.sortNum = sortNum;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getState() {
            return state;
        }

        public void setState(int state) {
            this.state = state;
        }

        public int getUserBalance() {
            return userBalance;
        }

        public void setUserBalance(int userBalance) {
            this.userBalance = userBalance;
        }

        public int getVip() {
            return vip;
        }

        public void setVip(int vip) {
            this.vip = vip;
        }

        public Object getRecommender() {
            return recommender;
        }

        public void setRecommender(Object recommender) {
            this.recommender = recommender;
        }

        public String getCreateDate() {
            return createDate;
        }

        public void setCreateDate(String createDate) {
            this.createDate = createDate;
        }

        public Object getQq() {
            return qq;
        }

        public void setQq(Object qq) {
            this.qq = qq;
        }

        public Object getArea() {
            return area;
        }

        public void setArea(Object area) {
            this.area = area;
        }

        public int getUserCharm() {
            return userCharm;
        }

        public void setUserCharm(int userCharm) {
            this.userCharm = userCharm;
        }

        public String getNickName() {
            return nickName;
        }

        public void setNickName(String nickName) {
            this.nickName = nickName;
        }

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public Object getUpdateUser() {
            return updateUser;
        }

        public void setUpdateUser(Object updateUser) {
            this.updateUser = updateUser;
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

        public int getUsableBalance() {
            return usableBalance;
        }

        public void setUsableBalance(int usableBalance) {
            this.usableBalance = usableBalance;
        }

        public int getFollowNum() {
            return followNum;
        }

        public void setFollowNum(int followNum) {
            this.followNum = followNum;
        }

        public int getEx() {
            return ex;
        }

        public void setEx(int ex) {
            this.ex = ex;
        }

        public Object getCreateUser() {
            return createUser;
        }

        public void setCreateUser(Object createUser) {
            this.createUser = createUser;
        }

        public int getUserType() {
            return userType;
        }

        public void setUserType(int userType) {
            this.userType = userType;
        }

        public Object getUsername() {
            return username;
        }

        public void setUsername(Object username) {
            this.username = username;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }
    }
}

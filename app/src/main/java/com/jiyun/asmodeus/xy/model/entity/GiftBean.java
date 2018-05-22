package com.jiyun.asmodeus.xy.model.entity;

public class GiftBean {

    /**
     * msg : 操作成功
     * ext :
     * code : 200
     * data : {"totalRow":18,"pageNumber":1,"firstPage":true,"lastPage":false,"totalPage":2,"pageSize":10,"list":[{},{},{"giftName":"幸运星","giftPrice":10,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085636641.jpg","id":35,"charmValue":10},{"giftName":"么么哒","giftPrice":10,"giftPic":"http://hd.connxun.com/whisper/img/gift/100/momoda.png","id":13,"charmValue":10},{"giftName":"掌声","giftPrice":10,"giftPic":"http://hd.connxun.com/whisper/img/gift/100/guzhang.png","id":15,"charmValue":10},{"giftName":"玫瑰花","giftPrice":10,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085567940.jpg","id":19,"charmValue":10},{"giftName":"炸弹","giftPrice":30,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085601777.jpg","id":39,"charmValue":30},{"giftName":"演员杯","giftPrice":30,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085615993.jpg","id":38,"charmValue":30},{"giftName":"巧克力","giftPrice":30,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085715262.jpg","id":42,"charmValue":30},{"giftName":"口红","giftPrice":30,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085590807.jpg","id":40,"charmValue":30}]}
     */

    private String msg;
    private String ext;
    private String code;
    /**
     * totalRow : 18
     * pageNumber : 1
     * firstPage : true
     * lastPage : false
     * totalPage : 2
     * pageSize : 10
     * list : [{},{},{"giftName":"幸运星","giftPrice":10,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085636641.jpg","id":35,"charmValue":10},{"giftName":"么么哒","giftPrice":10,"giftPic":"http://hd.connxun.com/whisper/img/gift/100/momoda.png","id":13,"charmValue":10},{"giftName":"掌声","giftPrice":10,"giftPic":"http://hd.connxun.com/whisper/img/gift/100/guzhang.png","id":15,"charmValue":10},{"giftName":"玫瑰花","giftPrice":10,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085567940.jpg","id":19,"charmValue":10},{"giftName":"炸弹","giftPrice":30,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085601777.jpg","id":39,"charmValue":30},{"giftName":"演员杯","giftPrice":30,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085615993.jpg","id":38,"charmValue":30},{"giftName":"巧克力","giftPrice":30,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085715262.jpg","id":42,"charmValue":30},{"giftName":"口红","giftPrice":30,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085590807.jpg","id":40,"charmValue":30}]
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

    public static class DataBean {
        private int totalRow;
        private int pageNumber;
        private boolean firstPage;
        private boolean lastPage;
        private int totalPage;
        private int pageSize;

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
    }
}

package com.jiyun.asmodeus.xy.model.entity;

import java.io.Serializable;
import java.util.List;

public class GiftBean  implements Serializable{

    /**
     * msg : 操作成功
     * ext :
     * code : 200
     * data : {"totalRow":18,"pageNumber":1,"firstPage":true,"lastPage":true,"totalPage":1,"pageSize":18,"list":[{"giftName":"麦克风","giftPrice":10,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085659474.jpg","id":32,"charmValue":10},{"giftName":"气球","giftPrice":10,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085628386.jpg","id":36,"charmValue":10},{"giftName":"幸运星","giftPrice":10,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085636641.jpg","id":35,"charmValue":10},{"giftName":"掌声","giftPrice":10,"giftPic":"http://hd.connxun.com/whisper/img/gift/100/guzhang.png","id":15,"charmValue":10},{"giftName":"玫瑰花","giftPrice":10,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085567940.jpg","id":19,"charmValue":10},{"giftName":"么么哒","giftPrice":10,"giftPic":"http://hd.connxun.com/whisper/img/gift/100/momoda.png","id":13,"charmValue":10},{"giftName":"巧克力","giftPrice":30,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085715262.jpg","id":42,"charmValue":30},{"giftName":"口红","giftPrice":30,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085590807.jpg","id":40,"charmValue":30},{"giftName":"炸弹","giftPrice":30,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085601777.jpg","id":39,"charmValue":30},{"giftName":"演员杯","giftPrice":30,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085615993.jpg","id":38,"charmValue":30},{"giftName":"抱一抱","giftPrice":30,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085460840.jpg","id":37,"charmValue":30},{"giftName":"钻戒","giftPrice":99,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085668193.jpg","id":31,"charmValue":99},{"giftName":"跑车","giftPrice":666,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085653975.jpg","id":33,"charmValue":666},{"giftName":"心动","giftPrice":666,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085709845.jpg","id":41,"charmValue":666},{"giftName":"比基尼","giftPrice":888,"giftPic":"http://hd.connxun.com/whisper/img/gift/100/bijini.png","id":20,"charmValue":1100},{"giftName":"游艇","giftPrice":1314,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085675516.jpg","id":24,"charmValue":1314},{"giftName":"别墅","giftPrice":3344,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085644517.jpg","id":34,"charmValue":3344},{"giftName":"水晶鞋","giftPrice":2888,"giftPic":"http://hd.connxun.com/whisper/img/gift/100/shuijingxie.png","id":22,"charmValue":3900}]}
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

    public static class DataBean {
        /**
         * totalRow : 18
         * pageNumber : 1
         * firstPage : true
         * lastPage : true
         * totalPage : 1
         * pageSize : 18
         * list : [{"giftName":"麦克风","giftPrice":10,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085659474.jpg","id":32,"charmValue":10},{"giftName":"气球","giftPrice":10,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085628386.jpg","id":36,"charmValue":10},{"giftName":"幸运星","giftPrice":10,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085636641.jpg","id":35,"charmValue":10},{"giftName":"掌声","giftPrice":10,"giftPic":"http://hd.connxun.com/whisper/img/gift/100/guzhang.png","id":15,"charmValue":10},{"giftName":"玫瑰花","giftPrice":10,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085567940.jpg","id":19,"charmValue":10},{"giftName":"么么哒","giftPrice":10,"giftPic":"http://hd.connxun.com/whisper/img/gift/100/momoda.png","id":13,"charmValue":10},{"giftName":"巧克力","giftPrice":30,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085715262.jpg","id":42,"charmValue":30},{"giftName":"口红","giftPrice":30,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085590807.jpg","id":40,"charmValue":30},{"giftName":"炸弹","giftPrice":30,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085601777.jpg","id":39,"charmValue":30},{"giftName":"演员杯","giftPrice":30,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085615993.jpg","id":38,"charmValue":30},{"giftName":"抱一抱","giftPrice":30,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085460840.jpg","id":37,"charmValue":30},{"giftName":"钻戒","giftPrice":99,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085668193.jpg","id":31,"charmValue":99},{"giftName":"跑车","giftPrice":666,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085653975.jpg","id":33,"charmValue":666},{"giftName":"心动","giftPrice":666,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085709845.jpg","id":41,"charmValue":666},{"giftName":"比基尼","giftPrice":888,"giftPic":"http://hd.connxun.com/whisper/img/gift/100/bijini.png","id":20,"charmValue":1100},{"giftName":"游艇","giftPrice":1314,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085675516.jpg","id":24,"charmValue":1314},{"giftName":"别墅","giftPrice":3344,"giftPic":"http://art.nos-eastchina1.126.net/cms1521085644517.jpg","id":34,"charmValue":3344},{"giftName":"水晶鞋","giftPrice":2888,"giftPic":"http://hd.connxun.com/whisper/img/gift/100/shuijingxie.png","id":22,"charmValue":3900}]
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
             * giftName : 麦克风
             * giftPrice : 10
             * giftPic : http://art.nos-eastchina1.126.net/cms1521085659474.jpg
             * id : 32
             * charmValue : 10
             */

            private String giftName;
            private int giftPrice;
            private String giftPic;
            private int id;
            private int charmValue;

            public String getGiftName() {
                return giftName;
            }

            public void setGiftName(String giftName) {
                this.giftName = giftName;
            }

            public int getGiftPrice() {
                return giftPrice;
            }

            public void setGiftPrice(int giftPrice) {
                this.giftPrice = giftPrice;
            }

            public String getGiftPic() {
                return giftPic;
            }

            public void setGiftPic(String giftPic) {
                this.giftPic = giftPic;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getCharmValue() {
                return charmValue;
            }

            public void setCharmValue(int charmValue) {
                this.charmValue = charmValue;
            }
        }
    }
}

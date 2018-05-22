package com.jiyun.asmodeus.xy.model.entity;

import java.util.List;

public class BannerBean {


    /**
     * msg : 操作成功
     * ext :
     * code : 200
     * data : {"msg":"操作成功","ext":"","code":"200","data":{"totalRow":4,"pageNumber":1,"firstPage":true,"lastPage":true,"totalPage":1,"pageSize":10,"list":[{"adName":"主播招募","adPic":"http://art.nos-eastchina1.126.net/cms1524453486914.jpg","adType":0,"adUrl":"http://www.baidu.com/","id":2},{"adName":"医美","adPic":"http://art.nos-eastchina1.126.net/cms1525428952844.jpg","adType":0,"adUrl":"1","id":6},{"adName":"文明公约","adPic":"http://art.nos-eastchina1.126.net/cms1526133288683.jpg","adType":8,"adUrl":"8","id":7},{"adName":"脱口秀","adPic":"http://art.nos-eastchina1.126.net/cms1524453472895.jpg","adType":null,"adUrl":"http://www.baidu.com/","id":1}]}}
     */

    private String msg;
    private String ext;
    private String code;
    private DataBeanX data;

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

    public DataBeanX getData() {
        return data;
    }

    public void setData(DataBeanX data) {
        this.data = data;
    }

    public static class DataBeanX {
        /**
         * msg : 操作成功
         * ext :
         * code : 200
         * data : {"totalRow":4,"pageNumber":1,"firstPage":true,"lastPage":true,"totalPage":1,"pageSize":10,"list":[{"adName":"主播招募","adPic":"http://art.nos-eastchina1.126.net/cms1524453486914.jpg","adType":0,"adUrl":"http://www.baidu.com/","id":2},{"adName":"医美","adPic":"http://art.nos-eastchina1.126.net/cms1525428952844.jpg","adType":0,"adUrl":"1","id":6},{"adName":"文明公约","adPic":"http://art.nos-eastchina1.126.net/cms1526133288683.jpg","adType":8,"adUrl":"8","id":7},{"adName":"脱口秀","adPic":"http://art.nos-eastchina1.126.net/cms1524453472895.jpg","adType":null,"adUrl":"http://www.baidu.com/","id":1}]}
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
             * totalRow : 4
             * pageNumber : 1
             * firstPage : true
             * lastPage : true
             * totalPage : 1
             * pageSize : 10
             * list : [{"adName":"主播招募","adPic":"http://art.nos-eastchina1.126.net/cms1524453486914.jpg","adType":0,"adUrl":"http://www.baidu.com/","id":2},{"adName":"医美","adPic":"http://art.nos-eastchina1.126.net/cms1525428952844.jpg","adType":0,"adUrl":"1","id":6},{"adName":"文明公约","adPic":"http://art.nos-eastchina1.126.net/cms1526133288683.jpg","adType":8,"adUrl":"8","id":7},{"adName":"脱口秀","adPic":"http://art.nos-eastchina1.126.net/cms1524453472895.jpg","adType":null,"adUrl":"http://www.baidu.com/","id":1}]
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

            public static class ListBean {
                /**
                 * adName : 主播招募
                 * adPic : http://art.nos-eastchina1.126.net/cms1524453486914.jpg
                 * adType : 0
                 * adUrl : http://www.baidu.com/
                 * id : 2
                 */

                private String adName;
                private String adPic;
                private int adType;
                private String adUrl;
                private int id;

                public String getAdName() {
                    return adName;
                }

                public void setAdName(String adName) {
                    this.adName = adName;
                }

                public String getAdPic() {
                    return adPic;
                }

                public void setAdPic(String adPic) {
                    this.adPic = adPic;
                }

                public int getAdType() {
                    return adType;
                }

                public void setAdType(int adType) {
                    this.adType = adType;
                }

                public String getAdUrl() {
                    return adUrl;
                }

                public void setAdUrl(String adUrl) {
                    this.adUrl = adUrl;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }
            }
        }
    }
}
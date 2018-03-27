package com.shtoone.liqing.mvp.model.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/8/11.
 */
public class PaveSpeedData {

    /**
     * data : [{"banhezhanminchen":"路面1标1号沥青摊铺机","tmpno":"hnymtp0101","tmpshijian":"2017-04-24 10:23:37:446","tmpsudu":"3.4833333403"},{"banhezhanminchen":"路面1标1号沥青摊铺机","tmpno":"hnymtp0101","tmpshijian":"2017-04-24 10:23:08:388","tmpsudu":"2.9833333393"},{"banhezhanminchen":"路面1标1号沥青摊铺机","tmpno":"hnymtp0101","tmpshijian":"2017-04-24 10:22:38:354","tmpsudu":"1.7666666702"},{"banhezhanminchen":"路面1标1号沥青摊铺机","tmpno":"hnymtp0101","tmpshijian":"2017-04-24 10:22:08:195","tmpsudu":"2.4500000049"},{"banhezhanminchen":"路面1标1号沥青摊铺机","tmpno":"hnymtp0101","tmpshijian":"2017-04-24 10:21:38:134","tmpsudu":"5.3333333440"},{"banhezhanminchen":"路面1标1号沥青摊铺机","tmpno":"hnymtp0101","tmpshijian":"2017-04-24 10:21:25:995","tmpsudu":"5.6000000112"},{"banhezhanminchen":"路面1标1号沥青摊铺机","tmpno":"hnymtp0101","tmpshijian":"2017-04-24 10:21:24:101","tmpsudu":"0.9666666686"},{"banhezhanminchen":"路面1标1号沥青摊铺机","tmpno":"hnymtp0101","tmpshijian":"2017-04-24 10:20:54:096","tmpsudu":"0.9000000018"},{"banhezhanminchen":"路面1标1号沥青摊铺机","tmpno":"hnymtp0101","tmpshijian":"2017-04-24 10:20:23:900","tmpsudu":"1.0000000020"},{"banhezhanminchen":"路面1标1号沥青摊铺机","tmpno":"hnymtp0101","tmpshijian":"2017-04-24 10:19:53:921","tmpsudu":"1.0333333354"}]
     * success : true
     */

    private boolean success;
    private List<DataBean> data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * banhezhanminchen : 路面1标1号沥青摊铺机
         * tmpno : hnymtp0101
         * tmpshijian : 2017-04-24 10:23:37:446
         * tmpsudu : 3.4833333403
         */

        private String banhezhanminchen;
        private String tmpno;
        private String tmpshijian;
        private String tmpsudu;

        public String getBanhezhanminchen() {
            return banhezhanminchen;
        }

        public void setBanhezhanminchen(String banhezhanminchen) {
            this.banhezhanminchen = banhezhanminchen;
        }

        public String getTmpno() {
            return tmpno;
        }

        public void setTmpno(String tmpno) {
            this.tmpno = tmpno;
        }

        public String getTmpshijian() {
            return tmpshijian;
        }

        public void setTmpshijian(String tmpshijian) {
            this.tmpshijian = tmpshijian;
        }

        public String getTmpsudu() {
            return tmpsudu;
        }

        public void setTmpsudu(String tmpsudu) {
            this.tmpsudu = tmpsudu;
        }
    }
}

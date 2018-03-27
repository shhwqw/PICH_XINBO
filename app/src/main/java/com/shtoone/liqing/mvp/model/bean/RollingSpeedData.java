package com.shtoone.liqing.mvp.model.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/8/11.
 */
public class RollingSpeedData {


    /**
     * data : [{"banhezhanminchen":"益马路面1标1号压路机","tmpno":"hnymyl0101","tmpshijian":"2017-07-07 16:38:39:725","tmpsudu":"9.52"},{"banhezhanminchen":"益马路面1标1号压路机","tmpno":"hnymyl0101","tmpshijian":"2017-07-07 16:37:39:255","tmpsudu":"5.87"},{"banhezhanminchen":"益马路面1标1号压路机","tmpno":"hnymyl0101","tmpshijian":"2017-07-07 16:36:39:294","tmpsudu":"0.43"},{"banhezhanminchen":"益马路面1标1号压路机","tmpno":"hnymyl0101","tmpshijian":"2017-07-07 16:35:38:693","tmpsudu":"0.6"},{"banhezhanminchen":"益马路面1标1号压路机","tmpno":"hnymyl0101","tmpshijian":"2017-07-07 16:34:38:792","tmpsudu":"0.63"},{"banhezhanminchen":"益马路面1标1号压路机","tmpno":"hnymyl0101","tmpshijian":"2017-07-07 16:33:38:759","tmpsudu":"0.73"},{"banhezhanminchen":"益马路面1标1号压路机","tmpno":"hnymyl0101","tmpshijian":"2017-07-07 16:32:38:792","tmpsudu":"1.1"},{"banhezhanminchen":"益马路面1标1号压路机","tmpno":"hnymyl0101","tmpshijian":"2017-07-07 16:31:39:255","tmpsudu":"1.87"},{"banhezhanminchen":"益马路面1标1号压路机","tmpno":"hnymyl0101","tmpshijian":"2017-07-07 16:29:38:714","tmpsudu":"2.92"},{"banhezhanminchen":"益马路面1标1号压路机","tmpno":"hnymyl0101","tmpshijian":"2017-07-07 16:28:38:803","tmpsudu":"0.97"}]
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
         * banhezhanminchen : 益马路面1标1号压路机
         * tmpno : hnymyl0101
         * tmpshijian : 2017-07-07 16:38:39:725
         * tmpsudu : 9.52
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

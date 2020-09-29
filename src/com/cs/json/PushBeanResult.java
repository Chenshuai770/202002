package com.cs.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

public class PushBeanResult {

    /**
     * status : 0
     * msg : success
     * data : [{"push_id":"10690","push_type":"0","push_platform":"\"all\"","push_audience":"{\"alias\":[\"21\"]}","push_title":"","push_alert":"关注了你","push_extras":"\"type\":\"user_interactive\",\"avatar\":\"https:/www.etx365.cn/upfile/picture/avatar_19.png\",\"unid\":\"\",\"nick\":\"伟伟\",\"time\":\"2020-06-24 21:23:08\",\"contentType\":\"0\",\"usn\":\"21\",\"message\":\"\",\"sender\":\"19\",\"noticeType\":\"focus\",\"desc\":\"关注了你\",\"index\":\"\"","push_plan":"2020-06-24 21:23:09.617","push_time":"2020-06-24 21:23:09.617","push_result":"1","push_msg_id":"54043264797564248","push_user_id":"21","push_domain":"0"}]
     */

    private String status;
    private String msg;
    private List<DataBean> data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * push_id : 10690
         * push_type : 0
         * push_platform : "all"
         * push_audience : {"alias":["21"]}
         * push_title :
         * push_alert : 关注了你
         * push_extras : "type":"user_interactive","avatar":"https:/www.etx365.cn/upfile/picture/avatar_19.png","unid":"","nick":"伟伟","time":"2020-06-24 21:23:08","contentType":"0","usn":"21","message":"","sender":"19","noticeType":"focus","desc":"关注了你","index":""
         * push_plan : 2020-06-24 21:23:09.617
         * push_time : 2020-06-24 21:23:09.617
         * push_result : 1
         * push_msg_id : 54043264797564248
         * push_user_id : 21
         * push_domain : 0
         */

        private String push_id;
        private String push_type;
        private String push_platform;
        private String push_audience;
        private String push_title;
        private String push_alert;
        @JSONField(serialize=false)
        private PushExtrasResult pushExtras;
        private String push_extras;
        private String push_plan;//定时校验时间
        private String push_time;//推送时间
        private String push_result;
        private String push_msg_id;
        private String push_user_id;
        private String push_domain;

        public String getPush_extras() {
            return push_extras;
        }

        public void setPush_extras(String push_extras) {
             this.push_extras = push_extras;
             String json = "{" + push_extras + "}";
             PushExtrasResult result = JSON.parseObject(json, PushExtrasResult.class);
             this.pushExtras = result;
        }

        public PushExtrasResult getPushExtras() {
            return pushExtras;
        }

        public void setPushExtras(PushExtrasResult pushExtras) {
            this.pushExtras = pushExtras;
        }

        public String getPush_id() {
            return push_id;
        }

        public void setPush_id(String push_id) {
            this.push_id = push_id;
        }

        public String getPush_type() {
            return push_type;
        }

        public void setPush_type(String push_type) {
            this.push_type = push_type;
        }

        public String getPush_platform() {
            return push_platform;
        }

        public void setPush_platform(String push_platform) {
            this.push_platform = push_platform;
        }

        public String getPush_audience() {
            return push_audience;
        }

        public void setPush_audience(String push_audience) {
            this.push_audience = push_audience;
        }

        public String getPush_title() {
            return push_title;
        }

        public void setPush_title(String push_title) {
            this.push_title = push_title;
        }

        public String getPush_alert() {
            return push_alert;
        }

        public void setPush_alert(String push_alert) {
            this.push_alert = push_alert;
        }


        public String getPush_plan() {
            return push_plan;
        }

        public void setPush_plan(String push_plan) {
            this.push_plan = push_plan;
        }

        public String getPush_time() {
            return push_time;
        }

        public void setPush_time(String push_time) {
            this.push_time = push_time;
        }

        public String getPush_result() {
            return push_result;
        }

        public void setPush_result(String push_result) {
            this.push_result = push_result;
        }

        public String getPush_msg_id() {
            return push_msg_id;
        }

        public void setPush_msg_id(String push_msg_id) {
            this.push_msg_id = push_msg_id;
        }

        public String getPush_user_id() {
            return push_user_id;
        }

        public void setPush_user_id(String push_user_id) {
            this.push_user_id = push_user_id;
        }

        public String getPush_domain() {
            return push_domain;
        }

        public void setPush_domain(String push_domain) {
            this.push_domain = push_domain;
        }
    }
}

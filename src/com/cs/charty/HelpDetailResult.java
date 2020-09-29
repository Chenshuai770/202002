package com.cs.charty;

import com.alibaba.fastjson.JSONArray;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * FileName: HelpDetailResult
 * Date: 2020/9/5 17:41
 * Author:cs
 * Description: 具体的详细信息
 */
public class HelpDetailResult {


    /**
     * _name : 紧急求助 - 天天 (17:20:0)
     * _time : e_time
     * _creator : 天天
     * _record : https://s.etx365.cn/audio/202009/608ed8360f1be6819b873af373e7c149.mp3
     * wpt : [{"name":"紧急求助 - 天天 (17:20:0)","lat":"30.155078","lon":"121.234417","ele":"7.33","time":"2020-09-05 17:20:00","desc":"<b>天天<\/b><br>1991年09月16日 (28 岁)<hr>经纬度: 30.155078,121.234417<br>时间: 2020-09-05 17:20:00<hr>血型: B+<br>体重: 50.0 公斤<br>身高: 175 厘米<br>过敏史: 青霉素药物过敏"}]
     * trk : [{"name":"2020-09-05 15:31:51.033 - 2020-09-05 15:32:53.173","distance":"0.02","begin_time":"2020-09-05 15:31:51.033","end_time":"2020-09-05 15:32:53.173","begin_latlon":[30.155081,121.234425,7.21],"end_latlon":[30.155294,121.234474,7.6],"trkseg":[[0,30.155081,121.234425,7.21,0,0],[0,30.155294,121.234474,7.6,0,0]]}]
     */

    private String _name;
    private String _time;
    private String _creator;
    private String _record;
    private List<WptBean> wpt;
    private List<TrkBean> trk;

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_time() {
        return _time;
    }

    public void set_time(String _time) {
        this._time = _time;
    }

    public String get_creator() {
        return _creator;
    }

    public void set_creator(String _creator) {
        this._creator = _creator;
    }

    public String get_record() {
        return _record;
    }

    public void set_record(String _record) {
        this._record = _record;
    }

    public List<WptBean> getWpt() {
        return wpt;
    }

    public void setWpt(List<WptBean> wpt) {
        this.wpt = wpt;
    }

    public List<TrkBean> getTrk() {
        return trk;
    }

    public void setTrk(List<TrkBean> trk) {
        this.trk = trk;
    }

    public static class WptBean {
        /**
         * name : 紧急求助 - 天天 (17:20:0)
         * lat : 30.155078
         * lon : 121.234417
         * ele : 7.33
         * time : 2020-09-05 17:20:00
         * desc : <b>天天</b><br>1991年09月16日 (28 岁)<hr>经纬度: 30.155078,121.234417<br>时间: 2020-09-05 17:20:00<hr>血型: B+<br>体重: 50.0 公斤<br>身高: 175 厘米<br>过敏史: 青霉素药物过敏
         */

        private String name;
        private String lat;
        private String lon;
        private String ele;
        private String time;
        private String desc;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLon() {
            return lon;
        }

        public void setLon(String lon) {
            this.lon = lon;
        }

        public String getEle() {
            return ele;
        }

        public void setEle(String ele) {
            this.ele = ele;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }

    public static class TrkBean {
        /**
         * name : 2020-09-05 15:31:51.033 - 2020-09-05 15:32:53.173
         * distance : 0.02
         * begin_time : 2020-09-05 15:31:51.033
         * end_time : 2020-09-05 15:32:53.173
         * begin_latlon : [30.155081,121.234425,7.21]
         * end_latlon : [30.155294,121.234474,7.6]
         * trkseg : [[0,30.155081,121.234425,7.21,0,0],[0,30.155294,121.234474,7.6,0,0]]
         */

        private String name;
        private String distance;
        private String begin_time;
        private String end_time;
        private List begin_latlon;
        private List<Double> end_latlon;
        private List<MapLoaction> trkseg;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }

        public String getBegin_time() {
            return begin_time;
        }

        public void setBegin_time(String begin_time) {
            this.begin_time = begin_time;
        }

        public String getEnd_time() {
            return end_time;
        }

        public void setEnd_time(String end_time) {
            this.end_time = end_time;
        }

        public List getBegin_latlon() {
            return begin_latlon;
        }


        public void setBegin_latlon(List begin_latlon) {

            this.begin_latlon = begin_latlon;


        }

        public List<Double> getEnd_latlon() {
            return end_latlon;
        }

        public void setEnd_latlon(List<Double> end_latlon) {
            this.end_latlon = end_latlon;
        }

        public List<MapLoaction> getTrkseg() {
            return trkseg;
        }

        public void setTrkseg(List<Object> trkseg) {

            List<MapLoaction> totolList = new ArrayList<>();
            for (Object alist : trkseg) {
                JSONArray li = (JSONArray)alist;
                MapLoaction mapLoaction = new MapLoaction();
                BigDecimal o1 = (BigDecimal) li.get(1);
                BigDecimal o2 = (BigDecimal) li.get(2);
                mapLoaction.setLatitude(o1.doubleValue());
                mapLoaction.setLatitude(o2.doubleValue());
                totolList.add(mapLoaction);
            }
            this.trkseg = totolList;
        }
    }
}

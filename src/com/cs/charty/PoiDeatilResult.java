package com.cs.charty;

import com.alibaba.fastjson.JSON;

public class PoiDeatilResult {
    private String name;
    private String address;
    private double latitude;
    private double longitude;
    private String region;
    private String region_name;
    private PoiInfoBean info;
    private String id;//更新依据


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }

    public PoiInfoBean getInfo() {
        return info;
    }

    public void setInfo(PoiInfoBean info) {
        this.info = info;
    }

    public static class PoiInfoBean {
        /**
         * tag : home
         */

        private String tag;

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }
    }

    public static void main(String[] args) {
        PoiDeatilResult poiDeatilResult = new PoiDeatilResult();
        poiDeatilResult.setName("家");
        poiDeatilResult.setAddress("我是地址");
        poiDeatilResult.setLatitude(123.21);
        poiDeatilResult.setLongitude(30.1123);
        poiDeatilResult.setRegion("330282");
        poiDeatilResult.setRegion_name("");
        PoiDeatilResult.PoiInfoBean poiInfoBean = new PoiDeatilResult.PoiInfoBean();
        poiInfoBean.setTag("home");
        poiDeatilResult.setInfo(poiInfoBean);

        System.out.println(JSON.toJSONString(poiDeatilResult));
    }

}

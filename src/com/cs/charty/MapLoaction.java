package com.cs.charty;

import com.alibaba.fastjson.JSONArray;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.BitSet;

/**
 * Create by Chenshuai
 * Date 2019/12/28 15:20
 * Descripton
 */
public class MapLoaction implements Serializable {
    private double longitude; //经度
    private double latitude;//纬度
    private double altitude;//海拔
    private double speed;//速度
    private String time;
    private String adcode;//地区编码 330282


    public MapLoaction() {
    }

    public MapLoaction(JSONArray list)
    {

        BigDecimal o1 = (BigDecimal) list.get(1);
        BigDecimal o2 = (BigDecimal) list.get(2);
        double lat = o1.doubleValue();
        double lon = o2.doubleValue();

        this.latitude = lat;
        this.longitude = lon;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAdcode() {
        return adcode;
    }

    public void setAdcode(String adcode) {
        this.adcode = adcode;
    }
}

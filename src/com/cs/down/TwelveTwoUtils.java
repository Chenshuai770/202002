package com.cs.down;


import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;


import java.util.Date;
import java.util.Objects;

/**
 * 十二时辰枚举，包含英文全称，中文全称，时间范围
 * <p>
 * author xkzhangsan
 * date 2020年08-01
 */
public class TwelveTwoUtils {


    public static String getTewlve(int hour) {

        String lunarTime = "";

        if (hour >= 1 && hour < 3) {
            lunarTime = "丑时";
        } else if (hour >= 3 && hour < 5) {
            lunarTime = "寅时";
        } else if (hour >= 5 && hour < 7) {
            lunarTime = "卯时";
        } else if (hour >= 7 && hour < 9) {
            lunarTime = "辰时";
        } else if (hour >= 9 && hour < 11) {
            lunarTime = "巳时";
        } else if (hour >= 11 && hour < 13) {
            lunarTime = "午时";
        } else if (hour >= 13 && hour < 15) {
            lunarTime = "未时";
        } else if (hour >= 15 && hour < 17) {
            lunarTime = "申时";
        } else if (hour >= 17 && hour < 19) {
            lunarTime = "酉时";
        } else if (hour >= 19 && hour < 21) {
            lunarTime = "戌时";
        } else if (hour >= 21 && hour < 23) {
            lunarTime = "亥时";
        } else {
            lunarTime = "子时";
        }
        return lunarTime;
    }


}

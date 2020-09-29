package com.cs.charty.socket;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class SubStringTest {
    public static void main(String[] args) {
        String a = "330282004";
        String substring = a.substring(0, 6);
        System.out.println(substring);

    }

    public static String Local2UTC() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("gmt"));
        String gmtTime = sdf.format(new Date());
        return gmtTime;


    }
}

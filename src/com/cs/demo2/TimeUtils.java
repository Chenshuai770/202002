package com.cs.demo2;

import org.joda.time.DateTime;

public class TimeUtils {
    public static void main(String[] args) {
        String timeString = "2020-03-02T14:30:11.000Z";
        DateTime dateTime = new DateTime(timeString);
        System.out.println(dateTime);
        String s = dateTime.toString("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        System.out.println(s);

        DateTime now = new DateTime();

        String s3 = now.toString("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        System.out.println(s3);
    }
}

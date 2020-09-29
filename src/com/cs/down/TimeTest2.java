package com.cs.down;

import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

public class TimeTest2 {
    public static void main(String[] args) {


        DateTime currentDateTime=new DateTime();
        DateTime dateTime = currentDateTime.withMillisOfDay(0).plusHours(1).plusMillis(0);
        System.out.println(dateTime.getHourOfDay());

        DateTime dateTime1 = new DateTime();
        System.out.println(dateTime1.getHourOfDay());



        System.out.println(TwelveTwoUtils.getTewlve(dateTime.getHourOfDay()));


    }
}

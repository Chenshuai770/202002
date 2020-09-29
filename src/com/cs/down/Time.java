package com.cs.down;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import java.time.LocalTime;
import java.util.Calendar;

public class Time {
    public static void main(String[] args) {
        String dayLunar = getDayLunar();
        System.out.println(dayLunar);
        LocalTime now = LocalTime.now();





        LocalTime ONECLOCK = LocalTime.of(1, 0, 0);
        String s = ONECLOCK.toString();
        System.out.println(s);
        DateTime dateTime = new DateTime().withHourOfDay(0).minus(2);
        System.out.println(dateTime.getHourOfDay());
//        System.out.println(dateTime.toString());

        LocalTime localTime = LocalTime.of(22, 0, 0);
        System.out.println(localTime.getHour());
//        String nameCn2 = TwelveTwoEnum.getNameCn();
//        System.out.println(nameCn2);

    }

    /**
     * 获取现在农历的日期
     */
    public static String getDayLunar() {
        LunarCalender lunarCalender = new LunarCalender();
//        String lunarDate = "00";
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DATE);
//        lunarDate = lunarCalender.getLunarDate(year, month, day, true);
//        String lunarMonth = lunarCalender.getLunarMonth();

//        System.out.println(lunarDate);
//        System.out.println(lunarMonth);

        String lunarAnimal = lunarCalender.animalsYear(year);
        String lunarString = lunarCalender.getLunarString(year, month, day);


        return lunarString + " [" + lunarAnimal + "]";

    }
}

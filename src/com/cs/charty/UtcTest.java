package com.cs.charty;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import java.security.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class UtcTest {
    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis() / 1000);
//        DateTime now = DateTime.now(DateTimeZone.UTC);
//        long millis = now.getMillis();
//        System.out.println(millis / 1000);
//
//
//        // get current moment in default time zone
//        DateTime dt = new DateTime();
//// translate to London local time
//        DateTime dtLondon = dt.withZone(DateTimeZone.forID("Europe/London"));
//        System.out.println(dtLondon.getMillis() / 1000);


        TimeZone timeZone = TimeZone.getDefault();
        int offset = timeZone.getRawOffset();
        Date date = new Date();
        long times = date.getTime();
        times -= offset;
        int r = (int)(times / 1000);
        System.out.println(r);
        System.out.println(getUTC());


        long utc2 = getUTC2(r);
        System.out.println(utc2);


        DateTime dateTime = new DateTime(utc2*1000);
        Date date1 = dateTime.toDate();
        System.out.println(dateTime.toString());
        System.out.println(date1.toString());


    }


    /**
     * 返回utc 时间
     *
     * @return
     * @throws Exception
     */
    public static long getUTC() {
        TimeZone timeZone = TimeZone.getDefault();
        int offset = timeZone.getRawOffset();
        Date date = new Date();
        long times = date.getTime();
        times -= offset;
        int r = (int) (times / 1000);
        return r;// 返回的UTC时间戳

    }

    /**
     * 返回utc 时间
     *
     * @return
     * @throws Exception
     */
    public static long getUTC2(long times) {
        TimeZone timeZone = TimeZone.getDefault();
        int offset = timeZone.getRawOffset();
        times = times * 1000;
        times += offset;
        int r = (int) (times / 1000);
        return r;// 返回的UTC时间戳

    }





    /**
     * 将UTC时间转换为东八区时间
     * @param UTCTime
     * @return
     */
    public static long getLocalTimeFromUTC(long UTCTime){

        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(UTCTime*1000);
        TimeZone tz = TimeZone.getTimeZone("GMT-8");
        cal.setTimeZone(tz);



        return cal.getTimeInMillis() / 1000 ;
    }



}

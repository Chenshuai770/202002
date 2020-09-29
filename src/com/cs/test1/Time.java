package com.cs.test1;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;

public class Time {
    public static void main(String[] args) {
        DateTime start = new DateTime(2020, 7, 16, 11, 2);

        LocalDate localDateStart = LocalDate.now();
        LocalDate localDateEnd = LocalDate.fromDateFields(start.toDate());
        int days = Days.daysBetween(localDateStart, localDateEnd).getDays();


        DateTime dateTime1 = start.plusDays(90);


        System.out.println(days);
    }
}

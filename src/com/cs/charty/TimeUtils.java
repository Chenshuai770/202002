package com.cs.charty;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

public class TimeUtils {
    public static void main(String[] args) {
        DateTime dt = new DateTime();
        long x = dt.millisOfDay().withMaximumValue().getMillis() - dt.getMillis();

        System.out.println(x/60/60/1000);

    }
}

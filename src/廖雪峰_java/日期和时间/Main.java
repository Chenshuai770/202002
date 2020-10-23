package 廖雪峰_java.日期和时间;

import java.time.Instant;

/**
 * FileName: Main
 * Date: 2020/10/23 11:13
 * Author:cs
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        long epochSecond = now.getEpochSecond();
        long l = now.toEpochMilli();
        System.out.println(epochSecond);
        System.out.println(l);
        System.out.println(System.currentTimeMillis());

    }
}

package 廖雪峰_java.集合.EnumMap;

import java.time.DayOfWeek;
import java.util.EnumMap;
import java.util.Map;

/**
 * FileName: Main
 * Date: 2020/10/22 14:01
 * Author:cs
 * Description:因为HashMap是一种通过对key计算hashCode()，通过空间换时间的方式，直接定位到value所在的内部数组的索引，因此，查找效率非常高
 */
public class Main {
    public static void main(String[] args) {
        Map<DayOfWeek, String> map = new EnumMap<>(DayOfWeek.class);
        map.put(DayOfWeek.MONDAY, "星期一");
        map.put(DayOfWeek.TUESDAY, "星期二");
        map.put(DayOfWeek.WEDNESDAY, "星期三");
        map.put(DayOfWeek.THURSDAY, "星期四");
        map.put(DayOfWeek.FRIDAY, "星期五");
        map.put(DayOfWeek.SATURDAY, "星期六");
        map.put(DayOfWeek.SUNDAY, "星期日");
        System.out.println(map);
        System.out.println(map.get(DayOfWeek.MONDAY));
    }
}

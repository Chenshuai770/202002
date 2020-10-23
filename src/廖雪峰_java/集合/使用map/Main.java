package 廖雪峰_java.集合.使用map;

import java.util.HashMap;
import java.util.Map;

/**
 * FileName: Main
 * Date: 2020/10/22 13:43
 * Author:cs
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 123);
        map.put("pear", 456);
        map.put("banana", 789);
        for (String key : map.keySet()) {
            System.out.println(key + "\t" + map.get(key));
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "\t" + value);

        }
    }
}

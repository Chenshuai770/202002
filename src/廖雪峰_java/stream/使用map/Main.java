package 廖雪峰_java.stream.使用map;

import java.util.ArrayList;
import java.util.List;

/**
 * FileName: Main
 * Date: 2020/11/24 10:46
 * Author:cs
 * Description: map对象的具体使用
 */
public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("   Bob");
        names.add("Alice  ");
        names.add("Tim   ");

        names.stream()
                .map(String::trim)
                .map(String::toLowerCase)
                .forEach(System.out::println);
    }
}

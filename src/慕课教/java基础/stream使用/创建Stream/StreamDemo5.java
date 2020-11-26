package 慕课教.java基础.stream使用.创建Stream;

import java.util.Arrays;
import java.util.List;

/**
 * FileName: StreamDemo5
 * Date: 2020/11/26 11:09
 * Author:cs
 * Description:
 */
public class StreamDemo5 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("php", "js", "python", "java");
        strings.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}

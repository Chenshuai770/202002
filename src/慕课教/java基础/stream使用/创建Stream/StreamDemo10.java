package 慕课教.java基础.stream使用.创建Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * FileName: StreamDemo10
 * Date: 2020/11/26 11:12
 * Author:cs
 * Description:
 */
public class StreamDemo10 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(10, 12, 9, 8, 20, 1, 10);
        Set<Integer> collect = integers.stream().collect(Collectors.toSet());
        System.out.println(collect);
    }
}

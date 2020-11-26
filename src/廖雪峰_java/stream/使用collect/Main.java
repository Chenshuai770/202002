package 廖雪峰_java.stream.使用collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * FileName: Main
 * Date: 2020/11/24 11:06
 * Author:cs
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Apple", "", null, "pear", "", "Orange");
        List<String> collect = stream.filter(s -> s != null && !s.isEmpty()).collect(Collectors.toList());
        System.out.println(collect);

        String[] array2 = collect.stream().toArray(String[]::new);
        System.out.println(Arrays.toString(array2));


    }
}

package 廖雪峰_java.stream.创建Stream;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * FileName: Test
 * Date: 2020/11/24 10:32
 * Author:cs
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        Stream<String> stream0 = Stream.of("A", "B", "C");
        stream0.forEach(System.out::println);

        Stream<String> stream1 = Arrays.stream(new String[]{"c", "d", "e"});
        List<String> list = new ArrayList<>();
        list.add("Bob");
        list.add("Alice");
        list.add("Tim");

        Stream<String> stream2 = list.stream();
        stream1.forEach(System.out::println);
        stream2.forEach(System.out::println);

        IntStream intStream = Arrays.stream(new int[]{1, 2, 3});


    }
}

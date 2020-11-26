package 廖雪峰_java.stream.使用filter;

import java.util.stream.IntStream;

/**
 * FileName: Main
 * Date: 2020/11/24 10:49
 * Author:cs
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .filter(n -> n % 2 != 0)
                .forEach(System.out::println);
    }
}

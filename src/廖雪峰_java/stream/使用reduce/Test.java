package 廖雪峰_java.stream.使用reduce;

import java.util.stream.Stream;

/**
 * FileName: Main
 * Date: 2020/11/24 10:53
 * Author:cs
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        Integer sum = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .reduce(0, (acc, n) -> acc + n);
        System.out.println(sum);

    }
}

package 廖雪峰_java.stream.demo1;

import java.util.Arrays;

/**
 * FileName: Test
 * Date: 2020/11/24 10:27
 * Author:cs
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        String[] array = new String[]{"apple", "Orange", "banana", "Lemon"};
        Arrays.sort(array,Test::cmp);
        System.out.println(Arrays.toString(array));
        System.out.println(String.join(", ", array));
    }
    static int cmp(String s1,String s2){
        return s1.toLowerCase().compareTo(s2.toLowerCase());
    }
}

package 廖雪峰_java.集合;

/**
 * FileName: test
 * Date: 2020/10/22 13:53
 * Author:cs
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        String key1 = "a";
        String key2 = new String("a");

        System.out.println(key1 == key2);
        System.out.println(key1.equals(key2));
    }
}

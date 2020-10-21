package 廖雪峰_java.String类型不可变;

/**
 * FileName: Interger进制转换
 * Date: 2020/10/21 20:56
 * Author:cs
 * Description:
 */
public class Interger进制转换 {
    public static void main(String[] args) {
        String s = Integer.toString(100);
        String s1 = Integer.toString(100, 2);
        String s2 = Integer.toBinaryString(100);
        System.out.println(s1);
        System.out.println(s2);
    }
}

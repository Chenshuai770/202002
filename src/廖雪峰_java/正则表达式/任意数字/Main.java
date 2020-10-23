package 廖雪峰_java.正则表达式.任意数字;

/**
 * FileName: Main
 * Date: 2020/10/23 13:43
 * Author:cs
 * Description:其中\d表示任意一个数字。
 * 把正则表达式转换为Java字符串就变成了20\\d\\d，注意Java字符串用\\表示\。
 */
public class Main {
    public static void main(String[] args) {
        String regex = "20\\d\\d";
        System.out.println("2019".matches(regex));
        System.out.println("2100".matches(regex));
    }
}

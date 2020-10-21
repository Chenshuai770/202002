package 廖雪峰_java.String类型不可变;

import java.util.StringJoiner;

/**
 * FileName: StringJoiner
 * Date: 2020/10/21 20:44
 * Author:cs
 * Description:
 */
public class StringJoiner使用 {
    public static void main(String[] args) {
        String[] names = {"Bob","Alice","Grace"};
        StringJoiner sj = new StringJoiner(",");
        StringJoiner sj2 = new StringJoiner(",","Hello ","!");
        for (String name : names) {
            sj.add(name);
            sj2.add(name);
        }
        System.out.println(sj.toString());
        System.out.println(sj2.toString());


    }
}

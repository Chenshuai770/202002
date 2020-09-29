package e_java.chapter4.item18.test;

/**
 * FileName: Test
 * Date: 2020/9/29 14:41
 * Author:cs
 * Description: 包装和非包装类型 https://alexyyek.github.io/2014/12/29/wrapperClass/
 */
public class Test {
    public static void main(String[] args) {
        Integer integer = new Integer(100);//java 5之前需要最原始的方式
        int i = 100;//自动创建 Integer类型 装箱
        Integer ia= Integer.valueOf(1000);//fby
        int index = i;//拆箱
        int index2 = ia.intValue();//fby

        Integer i1 = 100;
        Integer i2 = 100;
        Integer i3 = 200;
        Integer i4 = 200;



        System.out.println(i1==i2);
        System.out.println(i3==i4);

    }
}

package 廖雪峰_java.枚举.item2;

/**
 * FileName: Test
 * Date: 2020/10/13 14:51
 * Author:cs
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(PizzaStatus.ORDERED.name());//ORDERED
        System.out.println(PizzaStatus.ORDERED);//ORDERED
        System.out.println(PizzaStatus.ORDERED.name().getClass());//class java.lang.String
        System.out.println(PizzaStatus.ORDERED.getClass());//class shuang.kou.enumdemo.enumtest.PizzaStatus



    }
}

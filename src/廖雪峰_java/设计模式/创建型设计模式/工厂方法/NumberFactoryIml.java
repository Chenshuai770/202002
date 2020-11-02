package 廖雪峰_java.设计模式.创建型设计模式.工厂方法;

import java.math.BigDecimal;

/**
 * FileName: NumberFactoryIml
 * Date: 2020/10/26 11:37
 * Author:cs
 * Description:
 */

interface NumberFactory {
    //创建方法:
    Number parse(String s);

    //获取工厂实列
    static NumberFactory getFactory() {
        return iml;
    }

    NumberFactory iml = new NumberFactoryIml();

}


public class NumberFactoryIml implements NumberFactory {
    @Override
    public Number parse(String s) {
        return new BigDecimal(s);
    }


    public static void main(String[] args) {
        NumberFactory factory = NumberFactory.getFactory();
        Number parse = factory.parse("2");
        System.out.println(parse);
    }
}

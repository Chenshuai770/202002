package e_java.chapter5.item30.item2;

import java.util.function.UnaryOperator;

/**
 * FileName: GenericSingletonFactory
 * Date: 2020/10/12 11:15
 * Author:cs
 * Description: 泛型工厂
 */
public class GenericSingletonFactory {
    private static UnaryOperator<Object> IDENTITY_FN = (t) -> t;

    public static <T> UnaryOperator<T> identityFunction(){
        return (UnaryOperator<T>) IDENTITY_FN;
    }
    // Sample program to exercise generic singleton
    public static void main(String[] args) {
        String[] strings = { "jute", "hemp", "nylon" };
        UnaryOperator<String> sameString = identityFunction();
        for (String s : strings)
            System.out.println(sameString.apply(s));

        Number[] numbers = { 1, 2.0, 3L };
        UnaryOperator<Number> sameNumber = identityFunction();
        for (Number n : numbers)
            System.out.println(sameNumber.apply(n));
    }
}

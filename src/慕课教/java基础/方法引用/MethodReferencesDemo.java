package 慕课教.java基础.方法引用;

import java.util.Comparator;
import java.util.function.Function;

/**
 * FileName: MethodReferencesDemo
 * Date: 2020/11/26 10:53
 * Author:cs
 * Description:
 */
public class MethodReferencesDemo {
    public static void main(String[] args) {
        // 使用 Lambda 表达式
        Comparator<Integer> comparator1 = (t1, t2) -> Integer.compare(t1, t2);
        System.out.println(comparator1.compare(11, 12));

        // 使用方法引用，类 :: 静态方法（ compare() 为静态方法）
        Comparator<Integer> comparator2 = Integer::compare;
        System.out.println(comparator2.compare(12, 11));

        // 使用 Lambda 表达式
        Function<Double, Long> function1 = d -> Math.round(d);
        Long apply1 = function1.apply(1.0);
        System.out.println(apply1);

        // 使用方法引用，类 :: 静态方法（ round() 为静态方法）
        Function<Double, Long> function2 = Math::round;
        Long apply2 = function2.apply(2.0);
        System.out.println(apply2);



    }
}

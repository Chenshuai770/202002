package e_java.chapter5.item30.item1;

import java.util.HashSet;
import java.util.Set;

/**
 * FileName: UnionTest
 * Date: 2020/10/12 14:59
 * Author:cs
 * Description:
 */
public class UnionTest {
    public static <E> Set<E> union(Set<? extends E> set1, Set<? extends E> set2){//这里是最需要关注的
        Set result = new HashSet(set1);
        result.addAll(set2);
        return result;
    }

    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(3);
        integers.add(5);

        Set<Double> doubles =  new HashSet<>();
        doubles.add(2.0);
        doubles.add(4.0);
        doubles.add(6.0);

        Set<Number> numbers = union(integers,doubles);
        System.out.println(numbers);

    }
}

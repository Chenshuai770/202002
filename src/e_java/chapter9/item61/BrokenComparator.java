package e_java.chapter9.item61;

import java.util.Comparator;

/**
 * FileName: BrokenComparator
 * Date: 2020/10/19 11:37
 * Author:cs
 * Description:对装箱基本类型运用＝＝操作符几乎总是错误的
 */
public class BrokenComparator {


    public static void main(String[] args) {
        Comparator<Integer> naturalOrder = (i, j) -> (i < j) ? -1 : (i == j ? 0 : 1);
        int result1 = naturalOrder.compare(new Integer(42), new Integer(42));
        System.out.println(result1);

        // Fixed Comparator - Page 274
        Comparator<Integer> naturalOrder2 = (iBoxed, jBoxed) -> {
            int i = iBoxed, j = jBoxed; // Auto-unboxing
            return i < j ? -1 : (i == j ? 0 : 1);
        };
        int result2 = naturalOrder2.compare(new Integer(42), new Integer(42));
        System.out.println(result2);
    }


}

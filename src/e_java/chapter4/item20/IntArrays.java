package e_java.chapter4.item20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * FileName: IntArrays
 * Date: 2020/9/29 15:46
 * Author:cs
 * Description:
 */
public class IntArrays {
    static List<Integer> intArrayAsList(int[] a) {
        Objects.requireNonNull(a);
        return new ArrayList<Integer>() {
            @Override public Integer get(int i) {
                return a[i];  // Autoboxing (Item 6)
            }

            @Override public Integer set(int i, Integer val) {
                int oldVal = a[i];
                a[i] = val;     // Auto-unboxing
                return oldVal;  // Autoboxing
            }

            @Override public int size() {
                return a.length;
            }

        };
    }
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++)
            a[i] = i;

        List<Integer> list = intArrayAsList(a);
        Collections.shuffle(list);
        System.out.println(list);
    }
}

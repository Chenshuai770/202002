package com.cs.down;

import java.util.ArrayList;
import java.util.List;

public class D {
    private static int[] a = new int[]{};
    private static List<Integer> mList = new ArrayList<>();
    public static void main(String[] args) {
        for (int i = 1; i <= 5166; i++) {
            mList.add(i);
        }
        int index = mList.size() - 100;
        for (int i = 0; i < index; i++) {
            mList.remove(0);
        }
        System.out.println(mList);
        System.out.println('N' + 'C');

    }
}

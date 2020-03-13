package com.cs.demo1;

import java.util.ArrayList;
import java.util.List;

public class TestJava2 {
    private static int[] coords = {0, 1, 2, 9,6};

    public static void main(String[] args) {
        double d = 0;
        List<Double> points = new ArrayList<Double>();
        for (int i = 0; i < coords.length; i++) {
            if (i + 1 == coords.length) {
                break;
            }
            d  += Math.abs(coords[i] - coords[i + 1]);
            System.out.println(coords[i] + "\t" + coords[i + 1]+"\t"+d);
        }

        System.out.println(d);

    }
}

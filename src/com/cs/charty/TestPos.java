package com.cs.charty;

public class TestPos {
    public static void main(String[] args) {
        int a = 3;
        removeOne(a);
    }

    private static int removeOne(int pos) {
        if (pos == 0) {
            return -1;
        }
        pos--;
        System.out.printf(pos + "");

        return removeOne(pos);
    }
}

package com.cs.demo1;

public class Distance {

    public static void main(String[] args) {
        int d=902;
        if (d/1000<1) {
            System.out.println(d);
        }
        String a="wohsodaline.csd";
        String b = a.substring(0, a.lastIndexOf("."));
        System.out.println(b);
        System.out.println(b.replace("line", ""));
    }
}

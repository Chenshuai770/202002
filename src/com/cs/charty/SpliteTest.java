package com.cs.charty;

public class SpliteTest {
    public static void main(String[] args) {
        String a = "19223;3242;234;";
//        String a = "19223";
        String[] split = a.split(";");


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            if (i==split.length-1) {
                sb.append(split[i]);
                break;
            }
            sb.append(split[i] + "\n");
        }
        String s = sb.toString();
        System.out.println(s+"woshi");
    }
}

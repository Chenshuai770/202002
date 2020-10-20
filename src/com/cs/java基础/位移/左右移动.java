package com.cs.java基础.位移;

import java.util.Arrays;

/**
 * FileName: 左右移动
 * Date: 2020/10/20 15:20
 * Author:cs
 * Description:
 */
public class 左右移动 {
    public static void main(String[] args) {
        int i = 7;
        int b = i << 29;
        int c = i << 32;
        System.out.println(b);
        System.out.println(c);


        String[] names = {"ABC", "XYZ", "zoo"};
        String s = names[1];
        names[1] = "cat";
        System.out.println(s); // s是"XYZ"还是"cat"?
        System.out.println(Arrays.toString(names)); // s是"XYZ"还是"cat"?

    }
}

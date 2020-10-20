package com.cs.异常.自定义异常;

import java.util.Optional;

/**
 * Created by pc on 2020/10/19 22:08
 * Description: Demo1
 */
public class Main {
    public static void main(String[] args) {
        String s = null;
        System.out.println(s.toLowerCase());

        Optional.empty();
    }
}

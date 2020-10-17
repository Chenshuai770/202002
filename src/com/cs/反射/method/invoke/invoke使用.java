package com.cs.反射.method.invoke;

import java.lang.reflect.Method;

/**
 * FileName: Main
 * Date: 2020/10/17 16:00
 * Author:cs
 * Description: invoke相当于调用改方法
 */
public class invoke使用 {
    public static void main(String[] args) throws Exception {
        String s = "Hello World";
        String r = s.substring(6);
        System.out.println(r);

        Method substring = String.class.getMethod("substring", int.class);
        String rr = (String) substring.invoke(s, 6);
        System.out.println(rr);
    }
}

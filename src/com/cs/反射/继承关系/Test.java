package com.cs.反射.继承关系;

/**
 * FileName: Test
 * Date: 2020/10/17 16:49
 * Author:cs
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        Object n = Integer.valueOf(123);//向上转型

        boolean isDouble = n instanceof Double; // false
        boolean isInteger = n instanceof Integer; // true
        boolean isNumber = n instanceof Number; // true
        boolean isSerializable = n instanceof java.io.Serializable; // true

        System.out.println(isDouble);
        System.out.println(isInteger);
        System.out.println(isNumber);
        System.out.println(isSerializable);


//        通过Class对象的isAssignableFrom()方法可以判断一个向上转型是否可以实现。
        System.out.println(Integer.class.isAssignableFrom(Integer.class));
        System.out.println(Integer.class.isAssignableFrom(Object.class));//向上转型
        System.out.println(Object.class.isAssignableFrom(Integer.class));//向下转型

    }
}

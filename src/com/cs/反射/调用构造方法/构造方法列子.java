package com.cs.反射.调用构造方法;

import java.lang.reflect.Constructor;

/**
 * FileName: 构造方法列子
 * Date: 2020/10/17 16:31
 * Author:cs
 * Description:
 * getConstructor(Class...)：获取某个public的Constructor；
 * getDeclaredConstructor(Class...)：获取某个Constructor；
 * getConstructors()：获取所有public的Constructor；
 * getDeclaredConstructors()：获取所有Constructor。
 */
public class 构造方法列子 {
    public static void main(String[] args) throws Exception {
        Constructor<Integer> constructor1 = Integer.class.getConstructor(int.class);
        Integer integer1 = constructor1.newInstance(123);
        System.out.println(integer1);

        Constructor<Integer> constructor2 = Integer.class.getConstructor(String.class);
        Integer integer2 = constructor2.newInstance("456");
        System.out.println(integer2);

    }
}

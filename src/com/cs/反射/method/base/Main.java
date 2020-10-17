package com.cs.反射.method.base;

import java.lang.reflect.Method;

/**
 * FileName: Main
 * Date: 2020/10/17 15:09
 * Author:cs
 * Description:
 * Method getMethod(name, Class...)：获取某个public的Method（包括父类）
 * Method getDeclaredMethod(name, Class...)：获取当前类的某个Method（不包括父类）
 * Method[] getMethods()：获取所有public的Method（包括父类）
 * Method[] getDeclaredMethods()：获取当前类的所有Method（不包括父类）
 */

class Person{
    public String getName(){
        return "Person";
    }
}
class Student extends Person{
    public int getScore(String type){
        return 99;
    }
    private int getGrade(int year){
        return 1;
    }
}

public class Main {
    public static void main(String[] args) throws Exception  {
        Class stdClass = Student.class;
        // 获取public方法getScore，参数为String:
        Method getScore = stdClass.getMethod("getScore", String.class);
        System.out.println(getScore);
        // 获取继承的public方法getName，无参数:
        System.out.println(stdClass.getMethod("getName"));
        // 获取private方法getGrade，参数为int:
        Method getGrade = stdClass.getDeclaredMethod("getGrade", int.class);
        System.out.println(getGrade);
        System.out.println(getGrade.getName()+"\t"+getGrade.getReturnType()+"\t"+getGrade.getParameterTypes()+"\t"+getGrade.getModifiers());
    }

}

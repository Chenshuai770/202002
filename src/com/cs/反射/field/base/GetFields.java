package com.cs.反射.field.base;

import java.lang.reflect.Field;

/**
 * FileName: GetFields
 * Date: 2020/10/17 14:36
 * Author:cs
 * Description:
 * Field getField(name)：根据字段名获取某个public的field（包括父类）
 * Field getDeclaredField(name)：根据字段名获取当前类的某个field（不包括父类）
 * Field[] getFields()：获取所有public的field（包括父类）
 * Field[] getDeclaredFields()：获取当前类的所有field（不包括父类）
 */

class Person{
    public String name;
}

class Student extends Person{
    public int score;
    private int grade;
}

public class GetFields {
    public static void main(String[] args) throws NoSuchFieldException {
        Class<Student> studentClass = Student.class;
        Field score = studentClass.getField("score");
        System.out.println(score);
        Field name = studentClass.getField("name");
        Field name2 = studentClass.getDeclaredField("name");
        System.out.println(name);
        Field grade = studentClass.getDeclaredField("grade");
        System.out.println(grade);

    }
}

package com.cs.java基础.this和super;


/**
 * FileName: Main
 * Date: 2020/10/20 16:40
 * Author:cs
 * Description:子类自动获得了父类的所有字段，严禁定义与父类重名的字段！
 * 如果父类没有默认的构造方法，子类就必须显式调用super()并给出参数以便让编译器定位到父类的一个合适的构造方法。
 */

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    protected int score;

    public Student(String name, int age, int score) {
        super(name,age);
        this.score = score;
    }
}


public class Main {
    public static void main(String[] args) {
        Student s = new Student("Xiao Ming", 12, 89);
    }
}


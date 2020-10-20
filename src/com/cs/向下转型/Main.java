package com.cs.向下转型;


/**
 * FileName: Main
 * Date: 2020/10/20 16:40
 * Author:cs
 * Description:Person类型p1实际指向Student实例，Person类型变量p2实际指向Person实例。
 * 在向下转型的时候，把p1转型为Student会成功，
 * 因为p1确实指向Student实例，把p2转型为Student会失败，
 * 因为p2的实际类型是Person，不能把父类变为子类，因为子类功能比父类多，多的功能无法凭空变出来。
 */

class Person {


    public Person() {

    }
}

class Student extends Person {


}


public class Main {
    public static void main(String[] args) {
        Person p1 = new Student(); // upcasting, ok
        Person p2 = new Person();
        System.out.println(p1 instanceof Student);
        System.out.println(p2 instanceof Student);
        Student s1 = (Student) p1; // ok
        Student s2 = (Student) p2; // runtime error! ClassCastException!

    }
}


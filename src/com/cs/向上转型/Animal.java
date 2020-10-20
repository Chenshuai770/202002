package com.cs.向上转型;

/**
 * FileName: Animal
 * Date: 2020/10/19 13:32
 * Author:cs
 * Description:
 * 如果是访问成员变量，编译的话就是看父类，运行同样是看父类。
 * 如果是静态方法，编译和运行都是看父类。
 * 如果访问的方法，编译就看父类，运行则看子类。
 */


class Dog extends Animal{
    String name = "小狗";
    static int age = 60;


    public void eat() {
        System.out.println("小狗可以吃饭");
    }

    public static void sleep(){
        System.out.println("小狗可以睡觉");
    }

    public void watchDoor(){
        System.out.println("小狗可以看门");
    }
}

public class Animal {
    String name = "我是动物";
    static int age = 20;
    public void eat(){
        System.out.println("动物可以吃饭");
    }

    public static void sleep(){
        System.out.println("动物可以睡觉");
    }

    public void run(){
        System.out.println("动物可以奔跑");
    }

    public static void main(String[] args) {
        Animal am = new Dog();
        am.eat();
        am.sleep();
        am.run();
//        am.watchDoor();
        System.out.println(am.name);
        System.out.println(am.age);

        //向下转型
        //java同样支持向下转型，只是向下转型是有条件的——只有引用子类对象的父类引用才能被向下转型为子类对象。也就是说，向下转型之前，必须先向上转型。
        Dog dog = (Dog) am;
        dog.sleep();

    }
}




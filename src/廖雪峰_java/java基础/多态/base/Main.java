package 廖雪峰_java.java基础.多态.base;


/**
 * FileName: Main
 * Date: 2020/10/20 16:58
 * Author:cs
 * Description:Java的实例方法调用是基于运行时的实际类型的动态调用，而非变量的声明类型。
 * 多态的特性就是，运行期才能动态决定调用的子类方法。
 */

class Person{
    public void run(){
        System.out.println("Person.run");
    }
}

class Student extends Person{
    @Override
    public void run() {
        System.out.println("Student.run");
    }
}

class Teacher extends Person{
    @Override
    public void run() {
        System.out.println("Teacher.run");
    }
}



public class Main {
    public static void main(String[] args) {
        Person person = new Student();
        person.run();


        getPolymorphism(new Person());
        getPolymorphism(new Student());
        getPolymorphism(new Teacher());

    }


    /**
     * 多态的使用
     * @param person
     */
    public static void getPolymorphism(Person person){
        person.run();
    }
}




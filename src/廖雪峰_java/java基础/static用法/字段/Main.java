package 廖雪峰_java.java基础.static用法.字段;

/**
 * FileName: Main
 * Date: 2020/10/21 10:25
 * Author:cs
 * Description:
 * 实例字段在每个实例中都有自己的一个独立“空间”，但是静态字段只有一个共享“空间”，所有实例都会共享该字段
 * 因为在Java程序中，实例对象并没有静态字段。在代码中，实例对象能访问静态字段只是因为编译器可以根据实例类型自动转换为类名.静态字段来访问静态对象
 */
class Person {
    public String name;
    public int age;
    public static int number;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 为静态方法属于class而不属于实例，因此，静态方法内部，无法访问this变量，也无法访问实例字段，它只能访问静态字段。
     * @param value
     */
    public static void setNumber(int value) {
        //this.number = number;//编译器内部会报错
        number = value;
    }
}

public class Main {
    public static void main(String[] args) {
        Person ming = new Person("Xiao Ming", 12);
        Person hong = new Person("Xiao Hong", 15);
        ming.number = 88;
        System.out.println(hong.number);
        hong.number = 99;
        System.out.println(ming.number);
    }
}

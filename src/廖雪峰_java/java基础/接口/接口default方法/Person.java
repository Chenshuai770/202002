package 廖雪峰_java.java基础.接口.接口default方法;

/**
 * FileName: Person
 * Date: 2020/10/21 9:47
 * Author:cs
 * Description: 接口里面的的default的方法需要额外注意使用下
 */
interface Person {
    public static final int age = 25;//默认方法值得注意使用下

    default void run() {
        System.out.println(getName());
    }

    public abstract String getName();
}

class Student implements Person {

    private String name;
    public Student(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("我是高手");
    }

    @Override
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Person person = new Student("小明");
        person.run();
        System.out.println(person.age);
    }
}

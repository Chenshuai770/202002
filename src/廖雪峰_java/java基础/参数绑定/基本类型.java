package 廖雪峰_java.java基础.参数绑定;

/**
 * FileName: 基本类型
 * Date: 2020/10/20 16:21
 * Author:cs
 * Description:基本类型参数的传递，是调用方值的复制。双方各自的后续修改，互不影响。
 */
class Person{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}

public class 基本类型 {
    public static void main(String[] args) {
        Person person = new Person();
        int age = 15;// n的值为15
        person.setAge(age);// 传入n的值
        System.out.println(person.getAge());
        age= 20; // n的值改为20
        System.out.println(person.getAge());
    }
}

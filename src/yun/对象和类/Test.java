package yun.对象和类;

/**
 * FileName: Test
 * Date: 2020/11/6 15:25
 * Author:cs
 * Description: class开头的就是类,本类就是Test类
 */
public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();//类可以被初始化 用new关键字来表示初始化 animal代表Animal这个对象
        Cat cat = new Cat();//小写的cat代表了cat对象
        Dog dog = new Dog();//小写的dog代表了dog对象
        //我们此时在Test类里面,如果要将Test类变成对象的话,需要new Test()
        Test test = new Test();
        //总结 其实总结就是有new关键字就是对象,有class关键字的就是类,类可以通过 XXX xxx=new XXX()这样的方式初始化对象
        //一个Test里面有几个new就有几个对象



    }
}

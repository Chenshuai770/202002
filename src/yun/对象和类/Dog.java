package yun.对象和类;

/**
 * FileName: Dog
 * Date: 2020/11/6 15:24
 * Author:cs
 * Description:小狗类
 * class开头的就是类,本类就是Dog类
 */
public class Dog extends Animal {


    public void eat() {
        System.out.println(getType() + "吃");
    }

    public void sleep() {//
        System.out.println(getType() + "睡");
    }
}

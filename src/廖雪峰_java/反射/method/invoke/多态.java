package 廖雪峰_java.反射.method.invoke;

import java.lang.reflect.Method;

/**
 * FileName: 多态
 * Date: 2020/10/17 16:22
 * Author:cs
 * Description:
 */

class People{
    public void hello(){
        System.out.println("People:hello");
    }
}
class Student extends People{
    @Override
    public void hello() {
        System.out.println("Student:hello");
    }
}

public class 多态 {
    public static void main(String[] args) throws Exception {
        //获取people的方法
        Method method = People.class.getMethod("hello");
        //调用sutdent的实际例子
        method.invoke(new Student());


      /*  Person p = new Student();
        p.hello();*/
    }

}

package 廖雪峰_java.反射.method.invoke;

import java.lang.reflect.Method;

/**
 * FileName: 非public方法
 * Date: 2020/10/17 16:12
 * Author:cs
 * Description:
 */
class Person {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

public class 非public方法 {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        Method setName = person.getClass().getDeclaredMethod("setName", String.class);
        System.out.println(setName);
        setName.setAccessible(true);
        setName.invoke(person, "高手");
        System.out.println(person.name);
    }
}

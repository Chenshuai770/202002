package 廖雪峰_java.泛型.泛型接口;

/**
 * FileName: 泛型接口
 * Date: 2020/10/21 21:34
 * Author:cs
 * Description:
 */


interface C<T> {
    int compareTo(T o);
}

abstract class Person<T> {
    abstract int compareTo(T o);
}

public class 泛型接口 {
}

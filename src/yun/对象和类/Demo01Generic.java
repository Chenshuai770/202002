package yun.对象和类;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/*
泛型:是一种未知的数据类型,当我们不知道要使用什么数据类型的时候,可以使用泛型,泛型也可以看做是一个变量,用来接收数据类型
    E  e: Element元素
    T  t: Type  类型
举例说明:ArrayList集合在定义的时候,不知道集合中会存储什么类型的数据,所以使用泛型
    public class Arraylist<E>{
           public boolean add(E e){}
           public E get(int index){}
    }
    创建集合对象的时候,就会确定泛型的数据类型
    ArrayList<String> list=new Arraylist<>();
    会把数据类型作为参数传递,把String赋值给泛型E
    public class Arraylist<String>{
           public boolean add(String e){}
           public String get(int index){}
    }
     ArrayList<Student> list=new Arraylist<>();
     会把数据类型作为参数传递,把Student赋值给泛型E
    public class Arraylist<Student>{
           public boolean add(Student e){}
           public Student get(int index){}
    }

创建集合对象时不使用泛型  好处:集合不使用泛型,默认的就是Object类型,可以存储任意类型的数据
                     弊端:不安全,会引发异常
创建集合对象时使用泛型    好处:1.避免了类型转换的麻烦,存储的是什么类型,取出的就是什么类型
                          2.把运行期异常(代码运行之后会抛出的异常),提升到了编译期(写代码的时候会报错)
                     弊端:泛型是什么类型,就只能存储什么类型的数据
    */

public class Demo01Generic {
    public static void main(String[] args) {
        method01();
        method02();
    }

    //不使用泛型  好处:集合不使用泛型,默认的就是Object类型,可以存储任意类型的数据  弊端:不安全,会引发异常
    public static void method01() {
        Collection coll = new ArrayList();
        coll.add("abc");
        coll.add(123);
        coll.add('中');
        coll.add(true); //由于集合没有任何的限定,所以任何的数据类型都可以在其中存放

        Iterator it = coll.iterator();
        while (it.hasNext()) {
            Object obj = it.next();//那么取出的时候也只有Object类可以接收所有类型的数据
            System.out.println(obj);
            //需要打印每个每个字符串的长度,就要把迭代出来的对象转成String类型
            String str = (String) obj;//向下转型成为String类型   ClassCastException
            System.out.println(str.length()); //运行报错,因为使用向下转型一定要是本身就是String类型的数据,
            //不是这个类的就会报类转换异常的错误,因此它只能打印出"abc"的长度3,其他的都无法打印出来
        }
    }

    //使用泛型
    public static void method02() {
        ArrayList<String> list = new ArrayList<>();//指定泛型是String类型
        list.add("abc");        //添加元素的时候只能是String类型的 否则就会报错
        // list.add(123);
        //  list.add('中');
        // list.add(true);
        //使用迭代器遍历list集合
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
            System.out.println(str.length());
        }

    }

}

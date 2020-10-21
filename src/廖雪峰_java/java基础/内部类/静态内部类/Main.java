package 廖雪峰_java.java基础.内部类.静态内部类;

/**
 * FileName: Main
 * Date: 2020/10/21 20:10
 * Author:cs
 * Description:用static修饰的内部类和Inner Class有很大的不同，它不再依附于Outer的实例，而是一个完全独立的类，
 * 因此无法引用Outer.this，但它可以访问Outer的private静态字段和静态方法。如果把StaticNested移到Outer之外，就失去了访问private的权限。
 */
class Outer {
    private static String NAME = "OUTER";
    private int age = 0;
    private String getName;

    public Outer(String getName) {
        this.getName = getName;
    }

    static class StaticNested {
        void hello() {
            System.out.println("Hello, " + Outer.NAME);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer.StaticNested staticNested = new Outer.StaticNested();
        staticNested.hello();
    }
}

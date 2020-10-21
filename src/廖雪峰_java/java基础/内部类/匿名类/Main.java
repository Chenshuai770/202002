package 廖雪峰_java.java基础.内部类.匿名类;

/**
 * FileName: Main
 * Date: 2020/10/21 20:06
 * Author:cs
 * Description:Anonymous类型
 * 还有一种定义Inner Class的方法，它不需要在Outer Class中明确地定义这个Class，而是在方法内部，通过匿名类（Anonymous Class）来定义
 * 观察Java编译器编译后的.class文件可以发现，Outer类被编译为Outer.class，而匿名类被编译为Outer$1.class。
 * 如果有多个匿名类，Java编译器会将每个匿名类依次命名为Outer$1、Outer$2、Outer$3……
 */
class Outer{
    private String name;

    public Outer(String name) {
        this.name = name;
    }

    void asyncHello(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, " + Outer.this.name);
            }
        };
        new Thread(runnable).start();
    }

}

public class Main {
    public static void main(String[] args) {
        Outer nested = new Outer("Nested");
        nested.asyncHello();
    }

}

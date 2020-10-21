package 廖雪峰_java.java基础.内部类.Inner类;

/**
 * FileName: Main
 * Date: 2020/10/21 10:40
 * Author:cs
 * Description: 内部类
 * Java编译器编译后的.class文件可以发现，Outer类被编译为Outer.class，而Inner类被编译为Outer$Inner.class。
 */
class Outer{
    private String name;

    public Outer(String name) {
        this.name = name;
    }

    class Inner{
        void hello(){
            System.out.println("Hello, "+Outer.this.name);
        }
    }

}


public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer("Nested");
        Outer.Inner inner = outer.new Inner();
        inner.hello();

    }
}

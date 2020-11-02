package other.接口继承;

/**
 * FileName: Main
 * Date: 2020/10/28 9:55
 * Author:cs
 * Description:
 */
interface MyInterface1 {
    default String run() {//接口的默认方法
        return "MyInterface1";
    }

    static void sayHello(){
        System.out.println("我是接口中的静态方法,子类不需要直接实现,但是可以全部调用我并且可以被复写");
    }

    void abstractMethod1();
}

interface MyInterface2 extends MyInterface1 {
    void abstractMethod2();

}

interface MyInterface3 extends MyInterface2 {
    void abstractMethod3();
}


public class Person implements MyInterface3 {
    @Override
    public void abstractMethod1() {

    }

    @Override
    public void abstractMethod2() {

    }

    @Override
    public void abstractMethod3() {

    }

    @Override
    public String run() {
        return "Person的run方法";
    }

    public static void main(String[] args) {
        Person person = new Person();
        String run = person.run();
        System.out.println(run);


    }
}

package 廖雪峰_java.向上转型.add;

/**
 * FileName: Benz
 * Date: 2020/10/19 11:58
 * Author:cs
 * Description:这种把一个子类类型安全地变为父类类型的赋值，被称为向上转型（upcasting）。
 */

class Car {
    public void run() {
        System.out.println("这是父类run()方法");
    }

    public void speed() {
        System.out.println("speed:0");
    }
}

class BMW extends Car {
    @Override
    public void run() {
        System.out.println("这是BMW的run()方法");
    }

    @Override
    public void speed() {
        System.out.println("speed:80");
    }
}

public class Benz extends Car {
    @Override
    public void run() {
        System.out.println("这是Benz的run()方法");
    }

    @Override
    public void speed() {
        System.out.println("speed:100");
    }

    public void price() {
        System.out.println("Benz:800000$");
    }

    public static void main(String[] args) {
        show(new Benz());
        show(new BMW());
    }

    public static void show(Car car) {
        car.run();
        car.speed();
    }

//    如果此处没有向上转型，要实现show每个子类的功能，那么有几个子类就要写多少函数。代码如下：
//    public static void main(String[] args) {
//        show(new Benz());
//        show(new BMW());
//    }
//
//    public static void show(Benz benz) {
//        benz.run();
//        benz.speed();
//    }
//
//    public static void show(BMW bmw) {
//        bmw.run();
//        bmw.speed();
//    }
}

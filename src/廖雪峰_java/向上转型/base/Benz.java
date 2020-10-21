package 廖雪峰_java.向上转型.base;

/**
 * FileName: Benz
 * Date: 2020/10/19 11:54
 * Author:cs
 * Description:
 */
class Car{
    public void run(){
        System.out.println("这是父类run()方法");
    }
}

public class Benz extends Car{

    public void run() {
        System.out.println("这是Benz的run()方法");

    }

    public void price() {
        System.out.println("Benz:800000$");
    }

    public static void main(String[] args) {
        Car car = new Benz();
        car.run();
//        car.price(); //子类由于进行了向上转型，就失去了使用父类中所没有的方法的“权利”，在此处就是不能调用price()这个方法。
    }
}

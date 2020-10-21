package 廖雪峰_java.反射.动态代理.base;

/**
 * FileName: HelloWorld
 * Date: 2020/10/17 16:57
 * Author:cs
 * Description:
 */
public class HelloWorld implements Hello {
    @Override
    public void morning(String name) {
        System.out.println("Good morring,"+name);
    }

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        boolean s= helloWorld instanceof Hello;
        System.out.println(s);
        helloWorld.morning("Bob");

    }
}

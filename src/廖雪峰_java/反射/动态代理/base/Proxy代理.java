package 廖雪峰_java.反射.动态代理.base;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * FileName: Proxy
 * Date: 2020/10/17 17:00
 * Author:cs
 * Description:
 */
public class Proxy代理 {
    public static void main(String[] args) {

        //InvocationHandler 负责接口的调用
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method);
                if (method.getName().equals("morning")) {
                    System.out.println("Good morning, " + args[0]+args[1]);
                }

                return null;
            }
        };

        HelloX hello = (HelloX) Proxy.newProxyInstance(Hello.class.getClassLoader(), new Class[]{HelloX.class}, invocationHandler);
        hello.morning("高手",123);

    }
}

interface HelloX {
    void morning(String name,int age);
}


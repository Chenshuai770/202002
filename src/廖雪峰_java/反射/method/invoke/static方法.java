package 廖雪峰_java.反射.method.invoke;

import java.lang.reflect.Method;

/**
 * FileName: static方法
 * Date: 2020/10/17 16:07
 * Author:cs
 * Description:
 */
public class static方法 {
    public static void main(String[] args) throws Exception {
//        Integer.parseInt() 反射
        Method parseInt = Integer.class.getMethod("parseInt", String.class);
        Integer invoke = (Integer) parseInt.invoke(null, "123213");
        System.out.println(invoke);
    }
}

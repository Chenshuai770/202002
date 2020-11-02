package other.lambda表达式.单参数无返回值;

import java.util.function.Consumer;

/**
 * FileName: LambdaDemo3
 * Date: 2020/10/28 11:27
 * Author:cs
 * Description:无参数无返回值
 */
public class LambdaDemo3 {

    public static void main(String[] args) {
        // 单参数无返回值
        Consumer<String> consumer1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer1.accept("Hello World!");


        Consumer<String> consumer2 = (String s) -> {
            System.out.println(s);
        };
        consumer2.accept("你好,世界");

        Consumer<String> consumer3 = (s) -> {
            System.out.println(s);
        };
        consumer3.accept("你好,世界"+" 省略数据类型String");

        Consumer<String> consumer4 = s -> {
            System.out.println(s);
        };
        consumer4.accept("你好,世界"+"  省略参数的小括号");

        Consumer<String> consumer5 = s -> System.out.println(s);
        consumer5.accept("你好,世界"+"   省略 return 和大括号 当Lambda表达式体只有一条语句时，如果有返回");
    }
}

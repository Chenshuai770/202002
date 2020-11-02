package other.lambda表达式.无参数无返回值;

/**
 * FileName: LambdaDemo2
 * Date: 2020/10/28 11:26
 * Author:cs
 * Description:无参数无返回值
 * 一个括号内用逗号分隔的形式参数列表：实际上就是接口里面抽象方法的参数；
 * 一个箭头符号：->，这个箭头我们又称为 Lambda 操作符或箭头操作符；
 * 方法体：可以是表达式和代码块，是重写的方法的方法体。语法如下：
 */
public class LambdaDemo2 {
    public static void main(String[] args) {
        // 通过匿名内部类实例实例化一个 Runnable 接口的实现类
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {  // 方法无形参列表，也无返回值
                System.out.println("Hello, 匿名内部类");
            }
        };
        // 执行匿名内部类的 run() 方法
        runnable1.run();

        // 无参数无返回值，通过 lambda 表达式来实例化 Runnable 接口的实现类
        Runnable runnable = () -> System.out.println("Hello, Lambda");
        runnable.run();
    }
}

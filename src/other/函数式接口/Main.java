package other.函数式接口;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * FileName: Main
 * Date: 2020/10/28 11:38
 * Author:cs
 * Description:http://www.imooc.com/wiki/javalesson/functionalinterface.html
 * 5. 内置的函数式接口介绍
 * 通过上面一系列介绍和演示，相信对于函数式接口的概念和使用，你已经烂熟于心了。但是只知道这些还不够用，下面的内容才是本小节的重点，Java 中内置了丰富的函数式接口，位于java.util.function包下，学习这些函数式接口有助于我们理解 Java 函数式接口的真正用途和意义。
 *
 * Java 内置了 4 个核心函数式接口：
 *
 * Comsumer<T>消费型接口： 表示接受单个输入参数但不返回结果的操作，包含方法：void accept(T t)，可以理解为消费者，只消费（接收单个参数）、不返回（返回为 void）；
 * Supplier<T>供给型接口：表示结果的供给者，包含方法T get()，可以理解为供给者，只提供（返回T类型对象）、不消费（不接受参数）；
 * Function<T, R>函数型接口：表示接受一个T类型参数并返回R类型结果的对象，包含方法R apply(T t)；
 * Predicate<T>断言型接口：确定T类型的对象是否满足约束，并返回boolean值，包含方法boolean test(T t)。
 * 我们在 Java 的 api 文档中可以看到有一些方法的形参，会出现上面几类接口，我们在实例化这些接口的时候，就可以使用Lambda表达式的方式来实例化。
 */
@FunctionalInterface
interface FunCational {
    void run();
}

public class Main {
    public static void main(String[] args) {
        FunCational funCational = () -> System.out.println("我是自定义的函数式接口");
        funCational.run();

        //Todo 消费型接口
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("只消费,不返回");

        //供给型接口
        Supplier<String> supplier_s = () -> "只返回,不消费";
        Supplier<Integer> supplier_i = () -> 2;

        System.out.println(supplier_s.get());
        System.out.println(supplier_i.get());

    }
}

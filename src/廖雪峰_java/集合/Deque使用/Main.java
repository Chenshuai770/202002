package 廖雪峰_java.集合.Deque使用;

import java.util.Deque;
import java.util.LinkedList;

/**
 * FileName: Main
 * Date: 2020/10/22 16:31
 * Author:cs
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.offerLast("A");
        deque.offerLast("B");
        deque.offerLast("C");
        System.out.println(deque);
        deque.pollFirst();
        System.out.println(deque);
        deque.pollLast();
        System.out.println(deque);

       /* todo 我们发现LinkedList真是一个全能选手，它即是List，
           又是Queue，还是Deque。但是我们在使用的时候，总是用特定的接口来引用它，
           这是因为持有接口说明代码的抽象层次更高，而且接口本身定义的方法代表了特定的用途。
        LinkedList<String> d1 = new LinkedList<>();
        d1.offerLast("z");
// 推荐的写法：
        Deque<String> d2 = new LinkedList<>();
        d2.offerLast("z");*/
    }
}

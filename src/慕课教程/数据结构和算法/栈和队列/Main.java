package 慕课教程.数据结构和算法.栈和队列;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * FileName: Main
 * Date: 2020/11/2 10:12
 * Author:cs
 * Description:http://www.imooc.com/wiki/datalesson/stack3.html
 * 队列先进先出 FIFO 数据从队列的一端进入，从另一端取出。先到先得在我们生活中最常见的例子就是排队了。
 * 栈先进后出  LIFO   Vector 就是可实现自动增长的对象数组，它支持线程的同步。所以我们可以发现，栈的本质也是数组。数据从栈顶压入，操作的时候先从栈顶取出。
 */
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.isEmpty());
        //使用peek()方法查询栈顶元素，使用pop()方法取出栈顶元素
        System.out.println(stack.peek());//输出：3
        System.out.println(stack.pop());//输出：3
        System.out.println(stack.peek());//输出：2
        System.out.println(stack.pop());//输出：2
        System.out.println(stack.peek());//输出：1
        System.out.println(stack.pop());//输出：1
        System.out.println(stack.isEmpty());//输出：true

        System.out.println("******************队列*****************");//输出：true

        //声明一个队列
        Queue queue = new LinkedList();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        /**
         * add () ：增加一个元素，如果队列已满，则抛出一个 IIIegaISlabEepeplian 异常；
         * remove () ：移除并返回队列头部的元素，如果队列为空，则抛出一个 NoSuchElementException 异常；
         * element () ：返回队列头部的元素，如果队列为空，则抛出一个 NoSuchElementException 异常；
         * offer () ：添加一个元素并返回 true，如果队列已满，则返回 false；
         * poll () ：返问并移除队列头部的元素，如果队列为空，则返回 null；
         * peek () ：返回队列头部的元素，如果队列为空，则返回 null；
         */
        System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        queue.offer(1);
        System.out.println(queue.peek());


    }
}

package 廖雪峰_java.集合.Queue使用;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * FileName: Main
 * Date: 2020/10/22 16:00
 * Author:cs
 * Description:接下来我们以poll()和peek()为例来说说“获取并删除”与“获取但不删除”的区别
 * 对于Queue来说，每次调用poll()，都会获取队首元素，并且获取到的元素已经从队列中被删除了：
 * 如果用peek()，因为获取队首元素时，并不会从队列中删除这个元素，所以可以反复获取：
 */
public class Main {
    public static void main(String[] args) {



        Queue<String> q = new LinkedList<>();
        // 添加3个元素到队列:
        q.offer("apple");
        q.offer("pear");
        q.offer("banana");
        // 从队列取出元素:
      /*  System.out.println(q.poll()+"\t"+q.size());
        System.out.println(q.poll()+"\t"+q.size());
        System.out.println(q.poll()+"\t"+q.size());
        System.out.println(q.poll()+"\t"+q.size());*/

        System.out.println(q.peek()+"\t"+q.size());
        System.out.println(q.peek()+"\t"+q.size());
        System.out.println(q.peek()+"\t"+q.size());
        System.out.println(q.peek()+"\t"+q.size());

        //todo 多态的详细使用
        // 这是一个List:
        List<String> list = new LinkedList<>();
        // 这是一个Queue:
        Queue<String> queue = new LinkedList<>();
    }
}

package 廖雪峰_java.集合.List_使用;

import java.util.ArrayList;
import java.util.List;

/**
 * FileName: Main
 * Date: 2020/10/22 11:19
 * Author:cs
 * Description: 迭代器访问LinkList 迭代器可以在访问的时候删除list具体元素
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple"); // size=1
        list.add("pear"); // size=3
        list.add("bnanan"); // size=2
        System.out.println(list);
      /*  Iterator<String> iterator = list.iterator();
        for (list.iterator(); iterator.hasNext();){
            if (iterator.next().equals("pear")) {
                iterator.remove();
            }
//            System.out.println(iterator.next());
        }
        System.out.println(list);*/


        for (int i = 0; i < list.size(); i++) {
//            list.remove("apple");
            list.remove(i);
        }
        System.out.println(list);


        for (String s : list) {
            if (s.equals("pear")) {
                list.remove(s);
            }
        }
        System.out.println(list);

    }
}

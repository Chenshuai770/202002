package 廖雪峰_java.集合.Set使用;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * FileName: Main
 * Date: 2020/10/22 14:54
 * Author:cs
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        Set<String> set_hase = new HashSet<>();
        Set<String> set_tree = new TreeSet<>();


        set_hase.add("apple");
        set_hase.add("banana");
        set_hase.add("pear");
        set_hase.add("orange");
        for (String s : set_hase) {
            System.out.println(s);
        }

        set_tree.add("apple");
        set_tree.add("banana");
        set_tree.add("pear");
        set_tree.add("orange");
        for (String s : set_tree) {
            System.out.println(s);
        }
    }
}

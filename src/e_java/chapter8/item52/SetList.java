package e_java.chapter8.item52;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * FileName: SetList
 * Date: 2020/10/17 10:11
 * Author:cs
 * Description:
 */
public class SetList {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i = -3; i < 3; i++) {
            set.add(i);
            list.add(i);
        }

        System.out.println(set);
        System.out.println(list);

        for (int i = 0; i < 3; i++) {
            set.remove(i);//集合里面是值类型
            list.remove(Integer.valueOf(i));//列表里面是位置,非值
        }
        System.out.println(set + "\n" + list);
    }
}

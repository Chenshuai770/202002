package e_java.chapter5.item32;

import java.util.ArrayList;
import java.util.List;

/**
 * FileName: Dan
 * Date: 2020/10/12 15:53
 * Author:cs
 * Description:
 */
public class Dangerous {
    static void dangerous(List<String>... stringLists){
        List<Integer> intList = new ArrayList<>();
        intList.add(34);
        Object[] objects = stringLists;
        objects[0] = intList;
        String s = stringLists[0].get(0);
    }

    public static void main(String[] args) {
        List<String > stringList = new ArrayList<>();
        stringList.add("There be dragons!");
        dangerous(stringList);
    }
}

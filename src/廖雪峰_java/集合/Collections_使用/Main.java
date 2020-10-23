package 廖雪峰_java.集合.Collections_使用;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * FileName: Main
 * Date: 2020/10/22 16:55
 * Author:cs
 * Description:
 */
public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("pear");
        list.add("orange");
        // 排序前:
        System.out.println(list);
        Collections.sort(list);
        // 排序后:
        System.out.println(list);

        List<String> finalList = Collections.unmodifiableList(list);
        list.add("12");
//        Todo  新list不能加入任何数据 finalList不能加入任何数据,但是源list可以继续加入数据
//        finalList.add("12"); UnsupportedOperationException
        // TODO: 2020/10/22 建议立即删除原来的引用
        list = null;
        list.add("23");//NullPointerException
        System.out.println(list+"\t"+finalList);
    }
}

package alibaba.easy_coding.demo6;

import java.util.ArrayList;
import java.util.List;

/**
 * FileName: SubListFailFast
 * Date: 2020/11/9 9:16
 * Author:cs
 * Description:
 */
public class SubListFailFast {
    public static void main(String[] args) {
        List masterList = new ArrayList();
        masterList.add("one");
        masterList.add("two");
        masterList.add("three");
        masterList.add("four");
        masterList.add("five");

        List branchList = masterList.subList(0, 3);
        //下方三行代码,如果不注释掉,则会导致branchList操作出现异常
       /* masterList.remove(0);
        masterList.add("ten");
        masterList.clear();*/

        branchList.clear();
        branchList.add("six");
        branchList.add("seven");
        branchList.remove(0);

        System.out.println(branchList);

        //正常遍历结果只有一个 seven
        for (Object t : branchList) {
            System.out.println(t);
        }

        //子列表修改导致主列表也被改动,输入[seven,four,five]
        System.out.println(masterList);

    }
}

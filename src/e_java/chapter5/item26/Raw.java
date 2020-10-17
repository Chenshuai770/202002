package e_java.chapter5.item26;

import java.util.ArrayList;
import java.util.List;

/**
 * FileName: Raw
 * Date: 2020/10/12 10:36
 * Author:cs
 * Description:
 */
public class Raw {
    public static void main(String[] args) {
        List<String > stringList = new ArrayList<>();
        unsafeAdd(stringList,Integer.valueOf(42));
        String s = stringList.get(0);
    }
    private static void unsafeAdd(List list,Object o){
        list.add(o);
    }

    private static void unsafeAdd2(List<String> list,Object o){
        list.add((String) o);

    }
}

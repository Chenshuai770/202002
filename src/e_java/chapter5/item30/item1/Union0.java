package e_java.chapter5.item30.item1;

import java.util.HashSet;
import java.util.Set;

/**
 * FileName: Union
 * Date: 2020/10/12 11:05
 * Author:cs
 * Description:
 */
public class Union0 {
    public static void main(String[] args) {
//        union(new HashSet(1), new HashSet("2"));
    }

    public static Set union(Set set1, Set set2){
        Set result = new HashSet(set1);
        result.addAll(set2);
        return result;
    }
}

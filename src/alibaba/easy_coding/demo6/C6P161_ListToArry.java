package alibaba.easy_coding.demo6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by pc on 2020/11/8 21:15
 * Description: JavaStudy
 */
public class C6P161_ListToArry {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(3);
        list.add("one");
        list.add("two");
        list.add("three");

        // 泛型丢失，无法使用 String[] 接收无参方法的返回结果（第 1 处）
        Object[] array1 = list.toArray();
        System.out.println(Arrays.toString(array1));

        // array2 数组长度小于元素个数（第 2 处）
        String[] array2 = new String[2];
        list.toArray(array2);
        System.out.println(Arrays.asList(array2));

        // array3 数组长度等于元素个数（第 3 处）
        String[] array3 = new String[3];
        list.toArray(array3);
        System.out.println(Arrays.asList(array3));
    }
}

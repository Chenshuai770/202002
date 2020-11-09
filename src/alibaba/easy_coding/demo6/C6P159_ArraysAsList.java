package alibaba.easy_coding.demo6;

import java.util.Arrays;
import java.util.List;

/**
 * Created by pc on 2020/11/8 16:40
 * Description: JavaStudy
 */
public class C6P159_ArraysAsList {
    public static void main(String[] args) {
        String[] stringArray = new String[3];
        stringArray[0] = "one";
        stringArray[1] = "two";
        stringArray[2] = "three";

        List<String> stringList = Arrays.asList(stringArray);
        // 修改转换后的集合，成功地把第一个元素 “one” 改成 “oneList”
        stringList.set(0, "oneList");
        // 运行结果是 1，数组的值随之改变
        System.out.println(stringArray[0]);


        // 这是重点：以下三行编译正确，但都会抛出运行时异常 需要看arrays源码
        stringList.add("four");
        stringList.remove(2);
        stringList.clear();

    }
}

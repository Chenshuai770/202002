package other.函数式接口;

/**
 * FileName: FunctionalInterfaceDemo3
 * Date: 2020/10/28 11:46
 * Author:cs
 * Description:
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Java 内置4大核心函数式接口 —— 断言型接口
 * Predicate<T> boolean test(T t)
 * @author colorful@TaleLin
 * http://www.imooc.com/wiki/javalesson/functionalinterface.html
 */
public class FunctionalInterfaceDemo3 {

    /**
     * 根据 Predicate 断言的结果，过滤 list 中的字符串
     * @param list 待过滤字符串
     * @param predicate 提供规则的接口实例
     * @return 过滤后的列表
     */
    public static List<String> filterStringList(List<String> list, Predicate<String> predicate) {
        // 过滤后的字符串列表
        ArrayList<String> arrayList = new ArrayList<>();
        for (String string: list) {
            if (predicate.test(string)) {
                // 如果 test 是 true，则将元素加入到过滤后的列表中
                arrayList.add(string);
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("PHP");
        arrayList.add("Python");
        arrayList.add("JavaScript");
        System.out.println("过滤前：");
        System.out.println(arrayList);

        List<String> filterResult = filterStringList(arrayList, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                // 返回字符串中是否包含 P
                return s.contains("P");
            }
        });
        System.out.println("过滤后：");
        System.out.println(filterResult);
    }

}

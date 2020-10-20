package e_java.chapter9.item61;

/**
 * FileName: Unbelievable
 * Date: 2020/10/19 11:41
 * Author:cs
 * Description:  包装类在集合和反射中使用的比较常见
 */
public class Unbelievable {
    static Integer i1;
    static int i2;

    public static void main(String[] args) {

        if (i2==42) {
            System.out.println("Unbelievable");
        }

        if (i1==42) {//Integer 是引用类型,一开始需要判断是否为null值,所以谨慎使用装箱类用==
            System.out.println("Unbelievable");
        }
    }
}

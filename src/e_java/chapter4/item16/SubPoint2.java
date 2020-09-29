package e_java.chapter4.item16;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 私有域
 * 防止客户端可以随意修改源数据
 */
class SubPoint2 extends Point {
    private static final String[] PRIVATE_VALUES = {"1", "2"};

    public static final List<String> VALUES = Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));



    @Override
    String getName() {
        return "子类";
    }

    public static void main(String[] args) {
        System.out.println(VALUES);
       /* VALUES[0] = String.valueOf(3);
        System.out.println(Arrays.toString(VALUES));*/
    }
}

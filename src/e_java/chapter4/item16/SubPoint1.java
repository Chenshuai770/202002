package e_java.chapter4.item16;


import java.util.Arrays;
/**
 * 公有域
 * 客户端可以随意修改源数据
 */
class SubPoint1 extends Point {
    public static final String[] VALUES = {"1", "2"};

    @Override
    String getName() {
        return "子类";
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(VALUES));
        VALUES[0] = String.valueOf(3);
        System.out.println(Arrays.toString(VALUES));
    }
}

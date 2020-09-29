package e_java.chapter4.item16;


import java.util.Arrays;

/**
 * clone 通过方法
 * 防止客户端可以随意修改源数据
 */
class SubPoint3 extends Point {
    private static final String[] PRIVATE_VALUES = {"1", "2"};

    public static final String[] getValues(){
        return PRIVATE_VALUES.clone();
    }

    @Override
    String getName() {
        return "子类";
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getValues()));
        PRIVATE_VALUES[0] = "3";
        System.out.println(Arrays.toString(getValues()));
       /* VALUES[0] = String.valueOf(3);
        System.out.println(Arrays.toString(VALUES));*/
    }
}

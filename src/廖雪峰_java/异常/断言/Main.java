package 廖雪峰_java.异常.断言;

/**
 * Created by pc on 2020/10/19 22:11
 * Description: Demo1
 */
public class Main {
    public static void main(String[] args) {
//        double x = Math.abs(-123.45);
        double x = -1;
        assert x > 0;
        System.out.println(x);


    }
}

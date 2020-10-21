package 廖雪峰_java.异常.抛出异常;

/**
 * Created by pc on 2020/10/19 22:00
 * Description: Demo1
 */
public class Main_屏蔽异常 {
    public static void main(String[] args) {
        try {
            Integer.parseInt("abc");
        } catch (Exception e) {
            System.out.println("catched");
            throw new RuntimeException(e);
        }finally {
            System.out.println("finally");
            throw new IllegalArgumentException();
        }
    }
}

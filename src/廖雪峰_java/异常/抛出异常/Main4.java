package 廖雪峰_java.异常.抛出异常;

/**
 * Created by pc on 2020/10/19 21:58
 * Description: Demo1
 */
public class Main4 {
    public static void main(String[] args) {
        try {
            Integer.parseInt("abc");
        } catch (Exception e) {
            System.out.println("catched");
            throw new RuntimeException(e);
        } finally {
            System.out.println("finally");
        }
    }
}

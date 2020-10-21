package 廖雪峰_java.异常.抛出异常;

/**
 * Created by pc on 2020/10/19 22:00
 * Description: Demo1
 */
public class Main_保存异常 {
    public static void main(String[] args) throws Exception {
        Exception origin = null;
        try {
            Integer.parseInt("abc");
        } catch (Exception e) {
            origin = e;
            System.out.println("catched");
            throw e;
        }finally {

            System.out.println("finally");
            Exception e = new IllegalArgumentException();
            if (origin!=null) {
                e.addSuppressed(origin);
            }
            throw e;
        }
    }
}

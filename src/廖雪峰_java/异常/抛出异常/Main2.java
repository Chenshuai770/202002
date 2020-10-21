package 廖雪峰_java.异常.抛出异常;

/**
 * Created by pc on 2020/10/19 21:52
 * Description: Demo1
 */
public class Main2 {
    static void process2(){
        throw new NullPointerException();
    }
    static void process1(){

        try {
            process2();
        } catch (NullPointerException e) {
            throw new IllegalArgumentException("null");
        }
    }

    public static void main(String[] args) {
        process1();
    }
}

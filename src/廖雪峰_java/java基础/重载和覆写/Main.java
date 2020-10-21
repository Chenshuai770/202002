package 廖雪峰_java.java基础.重载和覆写;

/**
 * FileName: Main
 * Date: 2020/10/20 16:55
 * Author:cs
 * Description:Override和Overload不同的是，如果方法签名如果不同
 * ，就是Overload，Overload方法是一个新方法；如果方法签名相同，并且返回值也相同，就是Override。
 */
public class Main {
    public static void main(String[] args) {
    }

    class Person {
        public void run() {
        }
    }

    public class Student extends Person {
       /* @Override // Compile error!
        public void run(String s) {
        }

        public void run(String s) {
        }

        // 不是Override，因为返回值不同:
        public int run() {
        }*/
    }


}

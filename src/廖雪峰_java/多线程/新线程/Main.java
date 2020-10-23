package 廖雪峰_java.多线程.新线程;

/**
 * FileName: Main
 * Date: 2020/10/23 14:40
 * Author:cs
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("main start...");
        Thread t = new Thread() {
            public void run() {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("thread run...");
                System.out.println("thread end.");
            }
        };
        t.start();
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main end...");
    }
}

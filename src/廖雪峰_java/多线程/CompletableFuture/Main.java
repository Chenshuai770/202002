package 廖雪峰_java.多线程.CompletableFuture;

/**
 * FileName: Main
 * Date: 2020/10/24 10:38
 * Author:cs
 * Description:
 */
public class Main {
    public static void main(String[] args) throws Exception {
        log("start main...");
        new Thread(() -> {
            log("run task...");
        }).start();
        new Thread(() -> {
            log("print...");
        }).start();
        log("end main.");
    }

    static void log(String s) {
        System.out.println(Thread.currentThread().getName() + ": " + s);
    }
}

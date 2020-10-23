package 廖雪峰_java.多线程.中断线程;

/**
 * FileName: Test_Volatile
 * Date: 2020/10/23 16:25
 * Author:cs
 * Description:volatile 当一个线程修改了某个共享变量的值，其他线程能够立刻看到修改后的值
 */

class XThread extends Thread {
    public volatile boolean running = true;
    public void run() {
        int n = 0;
        while (running) {
            n ++;
            System.out.println(n + " hello!");
        }
        System.out.println("end!");
    }
}


public class Test_Volatile {
    public static void main(String[] args) throws InterruptedException {
        XThread t = new XThread();
        t.start();
        Thread.sleep(10);
        t.running = false;
    }
}

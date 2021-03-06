package 廖雪峰_java.多线程.中断线程;

/**
 * FileName: Main
 * Date: 2020/10/23 15:01
 * Author:cs
 * Description:
 */

class MyThread extends Thread{
    @Override
    public void run() {
        int n = 0;
        while (!isInterrupted()){
            n++;
            System.out.println(n + " hello!");
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new MyThread();
        t.start();
        Thread.sleep(1); // 暂停1毫秒
        t.interrupt(); // 中断t线程
        t.join(); // 等待t线程结束
        System.out.println("end");
    }
}

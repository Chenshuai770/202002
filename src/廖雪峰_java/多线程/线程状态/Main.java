package 廖雪峰_java.多线程.线程状态;

/**
 * FileName: Main
 * Date: 2020/10/23 14:53
 * Author:cs
 * Description:当线程启动后，它可以在
 * New、Runnable、Blocked、Waiting、Timed Waiting,Terminated
 * 这几个状态之间切换，
 * 直到最后变成Terminated状态，线程终止。
 *
 * 当main线程对线程对象t调用join()方法时，主线程将等待变量t表示的线程运行结束，即join就是指等待该线程结束，然后才继续往下执行自身线程。所以，上述代码打印顺序可以肯定是main线程先打印start，t线程再打印hello，main线程最后再打印end。
 * 如果t线程已经结束，对实例t调用join()会立刻返回。此外，join(long)的重载方法也可以指定一个等待时间，超过等待时间后就不再继续等待
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        });
        System.out.println("start");
        t.start();
        t.join();
        System.out.println("end");
    }
}

package 廖雪峰_java.多线程.线程同步;

/**
 * FileName: Main
 * Date: 2020/10/23 16:31
 * Author:cs
 * Description:
 *
 * synchronized(Counter.lock) { // 获取锁
 *     ...
 * } // 释放锁
 */

class Counter {
    public static final Object lock = new Object();//不可变的对象
    public static int count = 0;
}

class AddThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized (Counter.lock){
                Counter.count += 1;

            }
        }
    }
}

class DecThread extends Thread {
    @Override
    public void run() {

        for (int i = 0; i < 10000; i++) {
            synchronized (Counter.lock){
                Counter.count -= 1;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Thread add = new AddThread();
        Thread dec = new DecThread();
        add.start();
        dec.start();
        add.join();//必须加入join
        dec.join();//必须加入join
        System.out.println(Counter.count);
    }

}

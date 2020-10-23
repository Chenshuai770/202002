package 廖雪峰_java.多线程.中断线程;

/**
 * FileName: Test
 * Date: 2020/10/23 15:37
 * Author:cs
 * Description:
 */

class HelloThread extends Thread{
    @Override
    public void run() {
        int n = 0;
        while (!interrupted()){
            n++;
            System.out.println(n + " hello!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                break;//break while循环
            }
        }
    }
}

class TestThread extends Thread{
    @Override
    public void run() {
        System.out.println("TestThread 正在执行");
        Thread helloThread = new HelloThread();
        helloThread.start();//启动hello线程
      /*  try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        try {
            helloThread.join();//始终保证hello线程去执行
        } catch (InterruptedException e) {
            System.out.println("interrupted!");
        }
        helloThread.interrupt();//TestThread不终止线程执行,仍然会执行停止

    }
}

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new TestThread();
        t.start();
        Thread.sleep(1000);
        t.interrupt();//t线程会中断
        t.join();//试试隐藏会有什么结果
        System.out.println("end");

    }
}

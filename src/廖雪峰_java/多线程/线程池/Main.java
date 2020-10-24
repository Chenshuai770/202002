package 廖雪峰_java.多线程.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * FileName: Main
 * Date: 2020/10/24 10:24
 * Author:cs
 * Description:
 */

class Task implements Runnable{

    private final String name;

    Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("start task " + name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println("end task " + name);
    }
}

/**
 * 我们观察执行结果，一次性放入6个任务，由于线程池只有固定的4个线程，因此，前4个任务会同时执行，等到有线程空闲后，才会执行后面的两个任务。
 */
public class Main {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newFixedThreadPool(4);
        ExecutorService executorService = Executors.newCachedThreadPool();//如果我们把线程池改为CachedThreadPool，由于这个线程池的实现会根据任务数量动态调整线程池的大小，所以6个任务可一次性全部同时执行。
        for (int i = 0; i < 6; i++) {
            executorService.submit(new Task("" + i));
        }
        executorService.shutdown();//todo 使用shutdown()方法关闭线程池的时候，它会等待正在执行的任务先完成，然后再关闭。
//        executorService.shutdownNow();//todo shutdownNow()会立刻停止正在执行的任务
    }
}

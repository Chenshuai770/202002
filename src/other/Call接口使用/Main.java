package other.Call接口使用;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * FileName: Main
 * Date: 2020/10/28 11:12
 * Author:cs
 * Description:
 */


public class Main {

    static class MyThead implements Callable<String >{

        @Override
        public String call() throws Exception {
            return "我是线程中返回的字符串";
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 常见实现类的实例
        Callable<String> callable = new MyThead();
        // 使用 FutureTask 类来包装 Callable 对象
        FutureTask<String> futureTask = new FutureTask<>(callable);
        // 创建 Thread 对象
        Thread thread = new Thread(futureTask);
        //启动线程
        thread.start();
        // 调用 FutureTask 对象的 get() 方法来获得线程执行结束后的返回值
        String s = futureTask.get();
        System.out.println(s);

    }
}

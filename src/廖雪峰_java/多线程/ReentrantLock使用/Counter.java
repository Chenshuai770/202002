package 廖雪峰_java.多线程.ReentrantLock使用;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * FileName: Counter
 * Date: 2020/10/24 10:13
 * Author:cs
 * Description:
 */
public class Counter {
    private int count;
    private final Lock lock = new ReentrantLock();

    public void add(int n){
        lock.lock();
        try {
            count += n;
        } finally {
            lock.unlock();
        }
    }


}

package 廖雪峰_java.多线程.同步方法;

/**
 * FileName: Main
 * Date: 2020/10/23 16:53
 * Author:cs
 * Description:
 */

class Counter{
    private int count = 0;
    public void add1(int n){
        synchronized (Counter.this){
            count += n;
        }
    }


    public synchronized void add2(int n){
        count += n;
    }


    /**
     * 静态方法的同步实际上锁定的是由jvm自动创建的class实例
     * @param n
     */
   public static synchronized void add3(int n){
        //此时相当于
       synchronized (Counter.class){
//           count += n;
       }
   }

    public int getCount() {
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
    }

}

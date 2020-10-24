package e_java.chapter11.item78.brokenstopthread3;

/**
 * FileName: StopThread
 * Date: 2020/10/24 11:39
 * Author:cs
 * Description:
 */
public class StopThread {
    private static volatile boolean stopRequested;


    public static void main(String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!stopRequested){
                    i++;
                    System.out.println(i);
                }
            }
        });
        backgroundThread.start();
        Thread.sleep(1000);
        stopRequested = true;
    }
}

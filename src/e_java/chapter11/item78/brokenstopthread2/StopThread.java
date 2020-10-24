package e_java.chapter11.item78.brokenstopthread2;

/**
 * FileName: StopThread
 * Date: 2020/10/24 11:39
 * Author:cs
 * Description:
 */
public class StopThread {
    private static boolean stopRequested;

    private static synchronized void requestStop(){
        stopRequested = true;
    }
    private static synchronized  boolean stopRequested(){
        return stopRequested;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!stopRequested()){
                    i++;
                    System.out.println(i);
                }
            }
        });
        backgroundThread.start();
        Thread.sleep(1000);
        requestStop();
    }
}

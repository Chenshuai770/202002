package e_java.chapter11.item78.brokenstopthread;

/**
 * FileName: StopThread
 * Date: 2020/10/24 11:33
 * Author:cs
 * Description:
 */
public class StopThread {
    private static boolean stopThread = false;

    public static void main(String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!stopThread){
                    i++;
                    System.out.println(i);
                }
            }
        });
        backgroundThread.start();
//        TimeUnit.SECONDS.sleep(1);
        Thread.sleep(1000);
        stopThread = true;
    }
}

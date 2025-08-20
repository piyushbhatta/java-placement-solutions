package Multithreading;
import java.util.concurrent.TimeUnit;
class TaskC implements Runnable {
    public static int count = 0;

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            count++;
        }
    }
}

public class CriticalSectionProblem {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new TaskC());
        Thread t2 = new Thread(new TaskC());

        t1.start();
        t2.start();


        Thread.sleep(100);

        // Accessing count while threads may still be running
        System.out.println("Count : " + TaskC.count);
    }
}

package Multithreading;
import java.util.concurrent.TimeUnit;

class Task1 implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task 1 - Step " + i);
            try {
                TimeUnit.MILLISECONDS.sleep(500); // Pause for 0.5 second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // restore interrupted status
                System.out.println("Task 1 interrupted");
            }
        }
    }
}
class Task2 implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task 2 - Step " + i);
            try {
                TimeUnit.MILLISECONDS.sleep(500); // Pause for 0.5 second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // restore interrupted status
                System.out.println("Task 2 interrupted");
            }
        }
    }
}


public class differentMethod {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Task1());
        Thread t2 = new Thread(new Task2());

        t1.start();
        t2.start();
    }
}

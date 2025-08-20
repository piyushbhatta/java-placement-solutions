package Multithreading;
class Task implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task - Step " + i);
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted!");
                return; // Exit the thread
            }
        }
    }
}
public class interrupt {
    public static void main(String[] args) {
        Thread t = new Thread(new Task());
        t.start();

        try {
            Thread.sleep(3000); // Let the thread run for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Manually interrupt the thread
        t.interrupt();
    }

}

package Multithreading;

public class ThreadDemo {

    // First custom thread
    static class Task1 extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Task1 - Step " + i + " (Thread: " + Thread.currentThread().getName() + ")");
                try {
                    Thread.sleep(500); // Sleep for 0.5 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Second custom thread
    static class Task2 extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Task2 - Step " + i + " (Thread: " + Thread.currentThread().getName() + ")");
                try {
                    Thread.sleep(700); // Sleep for 0.7 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread starts (Thread: " + Thread.currentThread().getName() + ")");

        // Create threads
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();

        // Start threads
        t1.start(); // starts a new thread
        t2.start(); // starts another new thread

        // Uncomment this to see what happens if we call run() directly
        // t1.run(); // This would run in main thread, not a new thread

        // Main thread sleeps
        System.out.println("Main thread sleeping for 2 seconds...");
        Thread.sleep(2000);

        // Wait for threads to finish
        t1.join();
        t2.join();

        System.out.println("Main thread resumes after join, count = " + Thread.activeCount());
        System.out.println("Main thread ends (Thread: " + Thread.currentThread().getName() + ")");
    }
}

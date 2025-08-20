package CriticalSectionAndSolution;
import java.util.concurrent.Semaphore;

class SharedResource {
    private final Semaphore semaphore = new Semaphore(2); // only 2 permits

    void accessResource(String threadName) {
        try {
            semaphore.acquire();  // acquire permit
            System.out.println(threadName + " got access");

            // simulate work
            Thread.sleep(1000);

            System.out.println(threadName + " releasing access");
            semaphore.release(); // release permit
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class SemaphoreExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        for (int i = 1; i <= 5; i++) {
            final String name = "Thread-" + i;

            // Creating thread using Runnable (simple way)
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    resource.accessResource(name);
                }
            });

            t.start();
        }
    }
//    public static void main(String[] args) {
//        SharedResource resource = new SharedResource();
//
//        for (int i = 1; i <= 5; i++) {
//            final String name = "Thread-" + i;
//            new Thread(() -> resource.accessResource(name)).start();
//        }
//    }
}


package CriticalSectionAndSolution;
import java.util.concurrent.locks.ReentrantLock;
class CounterLock{
    private int count = 0;
    private ReentrantLock lock = new ReentrantLock();
    public void increment(){
        lock.lock();
        try{
            count++;
        }finally {
            lock.unlock();
        }
    }
    public int getCount(){
        return count;
    }
}
public class reentrantLock {
    public static void main(String[] args) throws Exception {
        CounterLock counterLock = new CounterLock();
        Runnable task = () -> {
            for (int i = 0; i < 1000000; i++) {
                counterLock.increment();
            }
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counterLock.getCount());
    }
}

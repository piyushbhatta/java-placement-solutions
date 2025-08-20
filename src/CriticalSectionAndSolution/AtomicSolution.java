package CriticalSectionAndSolution;
import java.util.concurrent.atomic.AtomicInteger;
class TaskB implements Runnable{
    public static AtomicInteger count = new AtomicInteger(0);
    @Override
    public void run(){
        for(int i=0;i<1000000;i++){
            increment();
        }
    }
    void increment(){
        count.incrementAndGet();
    }
}
public class AtomicSolution {
    public static void main(String[] args) throws Exception{
        Thread t1 = new Thread(new TaskB());
        Thread t2 = new Thread(new TaskB());

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(TaskB.count);
    }
}

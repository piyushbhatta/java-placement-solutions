package CriticalSectionAndSolution;
class TaskA implements Runnable{
    public static int count=0;
    @Override
    public void run(){
        for (int i = 0; i < 1000000; i++){
            count++;
        }
    }
}
public class problemStatement  {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(new TaskA());
        Thread t2 = new Thread(new TaskA());

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(TaskA.count);
    }
}

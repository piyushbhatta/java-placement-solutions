package CriticalSectionAndSolution;
class Task implements Runnable{
    public static int count =0;
    public static volatile boolean flag=false;
    @Override
    public void run() {
        while (count < 10) {
            if (!flag) {
                flag = true;
                if (count < 10) {  // recheck condition
                    System.out.println(Thread.currentThread().getName() + " incrementing " + count);
                    count++;
                }
                flag = false;
            }
        }
    }
}
public class flagSolution {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(new Task(), "T1");
        Thread t2 = new Thread(new Task(), "T2");

        t1.start();
        Thread.sleep(200);
        t2.start();

    }
}

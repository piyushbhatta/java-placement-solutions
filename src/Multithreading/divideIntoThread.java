package Multithreading;
class TaskA extends Thread{
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task 1 - Step " + i);
            try {
                Thread.sleep(500); // Pause for 0.5 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class TaskB extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task 2 - Step " + i);
            try {
                Thread.sleep(500); // Pause for 0.5 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class divideIntoThread {
    public static void main(String[] args) {
        TaskA taskA = new TaskA();
        TaskB taskB = new TaskB();

        taskA.start();
        taskB.start();
    }
}

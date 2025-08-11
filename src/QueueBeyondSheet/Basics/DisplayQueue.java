package QueueBeyondSheet.Basics;

import java.util.ArrayDeque;
import java.util.Queue;

public class DisplayQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        display(queue);
    }
    public static void display(Queue<Integer> queue){
        while(!queue.isEmpty()){
            System.out.printf(queue.poll()+" ");
        }
    }
}

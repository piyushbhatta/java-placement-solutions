package QueueBeyondSheet.Basics;

import java.util.ArrayDeque;
import java.util.Queue;

public class Basics {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.remove();
        System.out.println(queue.peek());
    }

}

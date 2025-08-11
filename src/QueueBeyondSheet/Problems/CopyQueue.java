package QueueBeyondSheet.Problems;

import java.util.ArrayDeque;
import java.util.Queue;

public class CopyQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(copyQ(queue));;
    }
    public static Queue<Integer> copyQ(Queue<Integer> queue){
        Queue<Integer> queue1 = new ArrayDeque<>();
        while(!queue.isEmpty()){
            queue1.add(queue.poll());
        }
        return queue1;
    }
}

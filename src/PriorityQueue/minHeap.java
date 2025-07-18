package PriorityQueue;

import java.util.PriorityQueue;

public class minHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(12);
        pq.add(9);
        pq.add(18);
        while(!pq.isEmpty()){
            System.out.printf(pq.poll()+" ");
        }
        System.out.println();
        pq.add(1);
        while(!pq.isEmpty()){
            System.out.printf(pq.poll()+" ");
        }
    }
}

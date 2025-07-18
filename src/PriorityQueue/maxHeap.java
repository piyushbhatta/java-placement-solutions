package PriorityQueue;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class maxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
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

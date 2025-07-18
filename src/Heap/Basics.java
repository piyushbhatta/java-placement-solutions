package Heap;

import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<Integer>();
        heap.insert(34);
        heap.insert(12);
        heap.insert(16);
//        System.out.println(heap.removes());
//        System.out.println(heap.removes());

        ArrayList<Integer> list = heap.heapSort();
        System.out.println(list);
    }
}

package stackqueue_I;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {
    static class Stack{
        Queue<Integer> queue = new LinkedList<>();
        void push(int val){
            int size= queue.size();
            queue.add(val);
            for(int i=0;i<size;i++){
                queue.add(queue.poll());
            }
        }

        int peek() throws Exception{
            if(queue.isEmpty()){
                throw new Exception("UnderFlow");
            }
            return queue.peek();
        }

        int pop() throws Exception{
            if(queue.isEmpty()){
                throw new Exception("UnderFlow");
            }
            return queue.poll();
        }

        int size(){
            return queue.size();
        }
        void display(){
            System.out.println(queue);
        }
    }

    public static void main(String[] args) throws Exception {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.display();
        System.out.println(s.peek());
    }
}

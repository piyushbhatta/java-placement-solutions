package StacksBeyondSheet.Implementation;
import java.util.LinkedList;
import java.util.Queue;
public class usingQueue {
    static class Stack{
        Queue<Integer> queue = new LinkedList<>();

        void push(int val){
            int size=queue.size();
            queue.add(val);
            for (int i=0;i<size;i++){
                queue.add(queue.poll());
            }
        }
        int peek() throws Exception{
            if(queue.isEmpty()){
                throw new Exception("Empty Stack");
            }
            return queue.peek();
        }
        int pop() throws Exception{
            if(queue.isEmpty()){
                throw new Exception("removing from Empty Stack");
            }
            return queue.poll();
        }
    }

    public static void main(String[] args) throws Exception{
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}

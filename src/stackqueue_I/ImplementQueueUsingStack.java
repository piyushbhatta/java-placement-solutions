package stackqueue_I;

import java.util.Stack;

public class ImplementQueueUsingStack {
    static class Queue{
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        void add(int val){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            stack1.push(val);
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
        }

        int peek(){
            return stack1.peek();
        }

        int poll(){
            return stack1.pop();
        }

        int size(){
            return stack1.size();
        }

        void display(){
            System.out.println(stack1);
        }
    }

    public static void main(String[] args) {

    }
}

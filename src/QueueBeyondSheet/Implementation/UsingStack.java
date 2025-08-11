package QueueBeyondSheet.Implementation;
import java.util.Stack;
public class UsingStack {
    static class Queue{
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();

        void add(int x){
            int size=stack.size();
            while(!stack.isEmpty()){
                stack1.push(stack.pop());
            }
            stack.push(x);
            while(!stack1.isEmpty()){
                stack.push(stack1.pop());
            }
        }
        int peek(){
            return stack.peek();
        }
        int pop(){
            return stack.pop();
        }
    }
}

package StacksBeyondSheet.BasicQuestions;

import java.util.Stack;

public class InsertAtBottomInStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
        insertAtBottom(stack,0);
        System.out.println(stack);
    }
    public static void insertAtBottom(Stack<Integer> stack, int n){
        Stack<Integer> stack1 = new Stack<>();
        while(!stack.empty()){
            stack1.push(stack.pop());
        }
        stack.push(n);
        while(!stack1.empty()){
            stack.push(stack1.pop());
        }
    }
}

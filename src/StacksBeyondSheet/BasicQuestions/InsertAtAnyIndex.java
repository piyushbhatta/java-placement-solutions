package StacksBeyondSheet.BasicQuestions;

import java.util.Stack;

public class InsertAtAnyIndex {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(4);
        stack.push(6);
        System.out.println(stack);
        int idx=3;
        int n=5;
        insertAtIdx(stack, idx, n);
        System.out.println(stack);
    }
    public static void insertAtIdx(Stack<Integer> stack, int idx, int n){
        Stack<Integer> stack1 = new Stack<>();
        while(stack.size()>idx){
            stack1.push(stack.pop());
        }
        stack1.push(n);
        while(!stack1.empty()){
            stack.push(stack1.pop());
        }
    }
}

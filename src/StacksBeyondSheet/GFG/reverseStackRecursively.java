package StacksBeyondSheet.GFG;

import java.util.Stack;

public class reverseStackRecursively {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
    public static void reverse(Stack<Integer> stack){
        if(stack.size()==1){
            return;
        }
        int x=stack.pop();
        reverse(stack);
        insertAtBottom(stack,x);
    }
    public static void insertAtBottom(Stack<Integer> stack, int element){
        Stack<Integer> stack1 = new Stack<>();
        while(!stack.isEmpty()){
            stack1.push(stack.pop());
        }
        stack.push(element);
        while(!stack1.isEmpty()){
            stack.push(stack1.pop());
        }
    }
}

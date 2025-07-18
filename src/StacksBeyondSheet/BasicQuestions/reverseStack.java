package StacksBeyondSheet.BasicQuestions;

import java.util.Stack;

public class reverseStack {
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
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while(!stack.isEmpty()){
            stack1.push(stack.pop());
        }
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        while(!stack2.isEmpty()){
            stack.push(stack2.pop());
        }
    }
}

package StacksBeyondSheet.BasicQuestions;

import java.util.Stack;

public class removeAtAnyIndex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        removeAt(st,st.size()-1);
        System.out.println(st);
    }
    public static void removeAt(Stack<Integer> stack, int idx){
        Stack<Integer> stack1 = new Stack<>();
        while(stack.size()>idx+1){
            stack1.push(stack.pop());
        }
        stack.pop();
        while(!stack1.empty()){
            stack.push(stack1.pop());
        }
    }
}

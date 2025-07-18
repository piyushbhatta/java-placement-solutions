package StacksBeyondSheet.BasicQuestions;

import java.util.Stack;

public class removeTheBottomElementInStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        deleteBottom(st);
        System.out.println(st);
    }
    public static void deleteBottom(Stack<Integer> stack){
        Stack<Integer> stack1 = new Stack<>();
        while(stack.size()>1){
            stack1.push(stack.pop());
        }
        stack.pop();
        while(!stack1.empty()){
            stack.push(stack1.pop());
        }
    }
}

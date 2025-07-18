package StacksBeyondSheet.BasicQuestions;

import java.util.Stack;

public class displayRecursively {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        displayRec(st);
    }
    public static void displayRec(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int x=stack.pop();
        displayRec(stack);
        System.out.print(x+" ");
    }
}

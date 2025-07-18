package StacksBeyondSheet.BasicQuestions;
import java.util.Stack;

public class CopyStacksInSameOrder {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        System.out.println(copyStack(st));
    }
    public static Stack<Integer> copyStack(Stack<Integer> st){
        Stack<Integer> st1 = new Stack<>();
        while(!st.isEmpty()){
            st1.push(st.pop());
        }
        Stack<Integer> st2= new Stack<>();
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        return st2;
    }
}

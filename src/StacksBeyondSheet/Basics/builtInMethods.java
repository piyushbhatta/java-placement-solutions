package StacksBeyondSheet.Basics;

import java.util.Stack;

public class builtInMethods {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);//[1]<- pushing 2
        stack.push(2);//[1,2] <- pushing 3
        stack.push(3);//[1,2,3] <-pushing 4
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.empty());
    }
}

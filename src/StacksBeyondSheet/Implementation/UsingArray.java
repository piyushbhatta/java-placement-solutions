package StacksBeyondSheet.Implementation;
import java.util.*;
public class UsingArray {
    public static class Stack{
        int[] arr = new int[100];
        private int ptr=0;
        private int size=0;

        public void push(int element){
            if(size==arr.length-1){
                System.out.println("Stack OverFlow");
                return;
            }
            arr[ptr]=element;
            ptr++;
            size++;
        }

        public int peek(){
            if(size==0){
                System.out.println("Stack UnderFlow");
                return -1;
            }
            return arr[ptr-1];
        }

        public int pop(){
            if(size==0){
                System.out.println("Stack UnderFlow");
                return -1;
            }
            ptr--;
            size--;
            return arr[ptr];
        }

        int getSize(){
            return size;
        }

        void display(){
            if(size==0){
                System.out.println("[]");
            }
            for(int i=0;i<size;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.display();
        stack.pop();
        stack.display();
        System.out.println(stack.getSize());
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        stack.display();
        System.out.println(stack.getSize());
        stack.push(4);
        stack.display();
        System.out.println(stack.getSize());
    }
}

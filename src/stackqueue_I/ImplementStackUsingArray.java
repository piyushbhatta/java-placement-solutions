package stackqueue_I;

public class ImplementStackUsingArray {
    static class Stack{
        int[] arr = new int[100];
        int ptr=0;

        void push(int val){
            if(ptr==arr.length){
                System.out.println("Stack is Full");
                return;
            }
            arr[ptr]=val;
            ptr++;
        }

        int peek(){
            if(ptr<0){
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[ptr-1];
        }

        int pop(){
            if(ptr<=0){
                System.out.println("Stack is Empty");
                return -1;
            }
            int x=arr[ptr-1];
            arr[ptr-1]=0;
            ptr--;
            return x;
        }

        void display(){
            if(ptr<=0){
                System.out.println("[]");
                return;
            }
            int idx=0;
            while (idx<ptr){
                System.out.print(arr[idx]+" ");
                idx++;
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
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.display();
        System.out.println(stack.pop());
        stack.push(4);
        stack.push(5);
        stack.display();
    }
}

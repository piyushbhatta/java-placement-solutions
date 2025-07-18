package StacksBeyondSheet.Implementation;

public class usingLinkedList {
    static class Stack{
        Node head=null;
        int size=0;

        void push(int data){
            Node temp = new Node(data);
            temp.next=head;
            head=temp;
            size++;
        }

        int peek(){
            if(head==null){
                System.out.println("Empty Stack");
                return -1;
            }
            return head.Data;
        }

        int pop(){
            if(head==null){
                System.out.println("Empty Stack");
                return -1;
            }
            int ans=head.Data;
            head=head.next;
            size--;
            return ans;
        }

        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.Data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

        int getSize(){
            return size;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(12);
        stack.push(13);
        stack.display();
        stack.pop();
        stack.display();
        System.out.println(stack.getSize());
    }
}

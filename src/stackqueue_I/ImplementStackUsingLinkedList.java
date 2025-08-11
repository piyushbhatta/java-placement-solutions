package stackqueue_I;

public class ImplementStackUsingLinkedList {
    static class Stack{
        Node head=null;
        int size=0;
        void push(int val){
            Node newNode = new Node(val);
            newNode.next=head;
            head=newNode;
        }

        int peek() throws Exception{
            if(head==null){
                throw new Exception("Stack is Empty");
            }
            return head.val;
        }

        int pop() throws Exception{
            if(head==null){
                throw new Exception("Stack UnderFlow");
            }
            int x=head.val;
            head=head.next;
            return head.val;
        }

        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.display();
        stack.pop();
        stack.display();
    }
}

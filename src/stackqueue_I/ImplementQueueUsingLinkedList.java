package stackqueue_I;

public class ImplementQueueUsingLinkedList {
    static class Queue{
        Node Start=null;
        Node End=null;
        int size=0;
        void add(int val){
            Node newNode = new Node(val);
            if(Start==null){
                Start=newNode;
                End=newNode;
            }else{
                End.next=newNode;
                End=newNode;
            }
            size++;
        }

        int peek() throws Exception{
            if(Start==null){
                throw new Exception("UnderFlow");
            }
            return Start.val;
        }

        int poll() throws Exception{
            if(Start==null){
                throw new Exception("UnderFlow");
            }
            int x= Start.val;
            Start=Start.next;
            return x;
        }

        void display(){
            if(Start==null){
                System.out.print("[]");
            }
            Node temp = Start;
            while (temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.display();
        System.out.println(q.poll());
        q.display();
        q.poll();
        System.out.println(q.peek());
        q.add(4);
        q.display();
        System.out.println(q.poll());
        q.poll();
        q.display();
        q.poll();
    }
}

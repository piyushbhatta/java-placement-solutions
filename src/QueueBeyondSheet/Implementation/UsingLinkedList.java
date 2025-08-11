package QueueBeyondSheet.Implementation;

public class UsingLinkedList {
    static class Node{
        private int val;
        private Node next;
        Node(){}
        Node(int val){
            this.val=val;
        }
    }
    static class Queue {
        private Node start=null;
        private Node end = null;
        int size;

        void add(int data){
            Node newNode = new Node(data);
            if(start==null){
                start=newNode;
                end=newNode;
            }
            else {
                end.next=newNode;
                end=newNode;
            }
            size++;
        }

        int peek() throws Exception{
            if(start==null){
                throw new Exception("Queue is Empty");
            }
            return start.val;
        }

        int poll() throws Exception{
            if(start==null){
                throw new Exception("Queue is Empty");
            }
            int ans=start.val;
            start=start.next;
            size--;
            return ans;
        }

        int size(){
            return size;
        }

        void display(){
            if(start==null){
                System.out.print("[]");
            }
            Node temp=start;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.display();
        System.out.println("peek :"+queue.peek());
        queue.poll();
        queue.display();
        System.out.println("size :"+queue.size());
        queue.poll();
        queue.display();
        System.out.println("size :"+queue.size());
        queue.poll();
        queue.display();
        System.out.println("size :"+queue.size());
        queue.add(12);
        queue.display();
        System.out.println("size :"+queue.size());
        queue.add(13);
        queue.display();
        System.out.println("size :"+queue.size());
        queue.add(15);
        queue.display();
        System.out.println("size :"+queue.size());
        System.out.println("peek :"+queue.peek());
    }
}

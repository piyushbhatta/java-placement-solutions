package Learning_LinkedList_I;

public class implementationPractice1 {
    public static class Node{
        int Data;
        Node next;
        Node(){

        }
        Node(int Data){
            this.Data=Data;
        }
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.Data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        void insertAtHead(int Val){
            Node newNode = new Node(Val);
            if(head==null){
                head=newNode;
                tail=newNode;
            }else{
                newNode.next=head;
                head=newNode;
            }
            size++;
        }
        void insertAt(int index, int Val){
            Node newNode = new Node(Val);
            Node temp = head;
            if(index==0){
                insertAtHead(Val);
                return;
            }
            if(index==size){
                insertAtEnd(Val);
                return;
            }
            for(int i=1;i<index;i++){
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
            size++;
        }
        void insertAtEnd(int Val){
            Node newNode = new Node(Val);
            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=newNode;
            }
            size++;
        }
        int get(int idx){
            if (idx < 0 || idx >= size) {
                throw new IndexOutOfBoundsException("Invalid index");
            }
            Node temp = head;
            for(int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.Data;
        }
        void delete(int idx){
            if (idx < 0 || idx >= size) {
                throw new IndexOutOfBoundsException("Invalid index");
            }
            Node temp = head;
            if(idx==0){
                head=head.next;
                size--;
                return;
            }
            for(int i=1;i<idx;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            if(idx==size-1){
                tail=temp;
            }
            size--;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtHead(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.insertAtHead(2);
        list.insertAt(3,6);
        list.display();
        System.out.println(list.get(4));
        list.delete(4);
        list.display();
        System.out.println(list.tail.Data);
    }
}

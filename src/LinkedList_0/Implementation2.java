package LinkedList_0;

public class Implementation2 {
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
        Node head=null;
        Node tail=null;
        int size;
        // Display
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.Data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        // Insertion
        void insertAtEnd(int Data){
            Node newNode = new Node(Data);
            if(head==null){
                head=newNode;
                tail=newNode;
            }else{
                tail.next=newNode;
                tail=newNode;
            }
            size++;
        }
        void insertAtStart(int Data){
            Node newNode = new Node(Data);
            if(head==null){
                head=newNode;
                tail=newNode;
            }else{
                newNode.next=head;
                head=newNode;
            }
            size++;
        }
        void insertAtIndex(int index, int Data){
            Node newNode = new Node(Data);
            Node temp=head;
            if(index==0){
                insertAtStart(Data);
            }
            else if(index==size){
                insertAtEnd(Data);
            }
            else{
                for (int i = 1; i < index ; i++) {
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
                size++;
            }
        }

        int get(int index){
            if(index<0 || index>=size){
                System.out.print("Wrong index ");
                return index;
            }
            Node temp=head;
            for(int i=1;i<=index;i++){
                temp=temp.next;
            }
            return temp.Data;
        }

        void delete(int index){
            Node temp=head;
            if(index==0){
                head=head.next;
                size--;
                return;
            }
            for(int i=1;i<=index-1;i++) {
                temp = temp.next;
            }
            temp.next=temp.next.next;
            if (index==size-1) {
                tail=temp;
            }
            size--;
        }
    }

    public static void main(String[] args) {
        LinkedList List = new LinkedList();
        List.insertAtStart(2);//2
        List.insertAtEnd(4);//2 -> 4
        List.insertAtStart(3);//3-> 2-> 4
        List.insertAtIndex(3,6);//3-> 2-> 4-> 6
        List.insertAtIndex(0,0);//0-> 3-> 2-> 4 ->6
        List.insertAtIndex(5,10);//0-> 3-> 2-> 4 ->6 ->10
        List.insertAtIndex(2,1);//0-> 3-> 1 ->2-> 4 ->6 ->10
        List.insertAtIndex(6,9);//0-> 3-> 1 ->2-> 4 ->6 ->9 ->10
        List.display();
        System.out.println(List.head.Data);

        System.out.println(List.get(List.size));

        List.delete(0);
        List.display();
        System.out.println(List.head.Data);

        List.delete(List.size-1);
        List.display();
        System.out.println(List.tail.Data);
    }
}

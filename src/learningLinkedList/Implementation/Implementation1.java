package learningLinkedList.Implementation;

public class Implementation1 {
    public static class Node{
        int Data;
        Node next;
        Node(int Data) {
            this.Data=Data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);
//        System.out.println(a.Data);
        a.next=b;
//        System.out.println(a.next.Data);
//        System.out.println(b.Data);
        b.next=c;
//        System.out.println(a.next.next.Data);
//        System.out.println(b.next.Data);
//        System.out.println(c.Data);
        c.next=d;
//        System.out.println(a.next.next.next.Data);
//        System.out.println(b.next.next.Data);
//        System.out.println(c.next.Data);
//        System.out.println(d.Data);
        d.next=e;
//      Print the LinkedList
        printLL(a);
//      Delete the Node Whose Data is Given
        deleteNode(a,8);
        System.out.println();
        printLL(a);
//      Insert the Node
        insertLL(a,10,4);
        System.out.println();
        printLL(a);
        System.out.println();
        System.out.println(sizeLL(a));
//      Delete the Nth Node of the LinkedList
        deleteNodeNo(a,3);
        printLL(a);
//      Length of the LinkedList
        System.out.println();
        System.out.println(sizeLL(a));
    }
    public static int sizeLL(Node head){
        Node temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
    public static void printLL(Node head){
        int i=0;
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.Data + " ");
            temp = temp.next;
        }
    }
    public static void insertLL(Node head, int data, int pos){
        Node temp = head;
        Node newNode = new Node(data);
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public static void deleteNode(Node head, int dData){
        Node temp=head;
        while(temp.next.Data!=dData){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }

    public static void deleteNodeNo(Node head, int NodeNo){
        Node temp=head;
        for(int i=1;i<NodeNo-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
}

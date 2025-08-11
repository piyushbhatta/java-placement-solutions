package LinkedList_0.BasicQuestions;

public class InsertAtIndex {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        a.next=b; b.next=c; c.next=d; d.next=e;
        Display.display(a);
        Display.display(insertAt(a,2,3));
        a=insertAtHead(a,0);
        Display.display(a);
        insertAtEnd(a,7);
        Display.display(a);
    }
    public static Node insertAt(Node head, int index, int val){
        Node temp = head;
        Node newNode = new Node(val);
        for(int i = 1;i<index;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        return head;
    }

    public static Node insertAtHead(Node head, int val){
        Node newNode = new Node(val);
        newNode.next=head;
        head=newNode;
        return head;
    }
    public static Node insertAtEnd(Node head, int val){
        Node newNode = new Node(val);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return head;
    }
}

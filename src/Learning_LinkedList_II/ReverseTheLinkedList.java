package Learning_LinkedList_II;

public class ReverseTheLinkedList {
    public static void main(String[] args) {
        Node Head = new Node(3);
        Node a = new Node(12);
        Node b = new Node(36);
        Node c = new Node(72);
        Node d = new Node(108);
        Node tail = new Node(216);
        // 3 12 36 72 108 216
        Head.next=a;
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=tail;
        Display.display(Head);
        Node headrev=iterativeReversal(Head);
        Display.display(headrev);
    }
    public static Node reverse(Node head){
        if(head.next==null){
            return head;
        }
        Node newHead =reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
    public static Node iterativeReversal(Node head){
        Node prev = null;
        Node current = head;
        Node upComing = null;
        while(current!=null){
            upComing=current.next;
            current.next=prev;
            prev=current;
            current=upComing;
        }
        return prev;
    }
}

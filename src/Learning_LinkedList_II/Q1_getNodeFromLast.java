package Learning_LinkedList_II;

public class Q1_getNodeFromLast {

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
        System.out.println(nodeFromEnd(Head,6).val);
    }
    public static Node nodeFromEnd(Node head, int n){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}

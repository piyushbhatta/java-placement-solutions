package LinkedList_Striver_I;

public class deleteNodeInLL {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(2);
        ListNode a = new ListNode(4);
        ListNode b = new ListNode(3);
        head1.next=a; a.next=b;

        ListNode.ListDisplay(head1);
        deleteNode(a);
        ListNode.ListDisplay(head1);
    }
    public static void deleteNode(ListNode Node){
        Node.val=Node.next.val;
        Node.next=Node.next.next;
    }
}

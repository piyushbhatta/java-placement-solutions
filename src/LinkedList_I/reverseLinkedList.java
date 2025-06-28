package LinkedList_I;

public class reverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(4);
        ListNode tail = new ListNode(5);
        head.next=a; a.next=b; b.next=c; c.next=tail;
        ListNode.ListDisplay(head);
        ListNode revhead =reverse(head);
        ListNode.ListDisplay(revhead);
    }
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        ListNode upComing = null;
        while(current!=null){
            upComing=current.next;
            current.next=prev;
            prev=current;
            current=upComing;
        }
        return prev;
    }
}

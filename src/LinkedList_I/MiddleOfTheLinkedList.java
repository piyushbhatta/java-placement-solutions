package LinkedList_I;

/// If there are two middle nodes, return the second middle node.
public class MiddleOfTheLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(5);
        ListNode e = new ListNode(6);
        head.next=a; a.next=b; b.next=c; c.next=d; d.next=e;
        System.out.println(middleOfTheLL(head).val);
    }
    public static ListNode middleOfTheLL(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}

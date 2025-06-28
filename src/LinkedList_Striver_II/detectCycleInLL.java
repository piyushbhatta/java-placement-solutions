package LinkedList_Striver_II;

public class detectCycleInLL {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(4);
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(8);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(5);
        head1.next=a; a.next=b; b.next=c; c.next=d;

        System.out.println(detectCycle(head1));
    }
    public static boolean detectCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }
}

package LinkedList_II;

public class startingPointOfCycle {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(4);
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(8);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(5);
        head1.next=a; a.next=b; b.next=c; c.next=d; d.next=b;
        System.out.println(startingPoint(head1).val);
    }
    public static ListNode startingPoint(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        do{
            if(fast==null || fast.next==null){
                return null;
            }
            slow=slow.next;
            fast=fast.next.next;
        }while(slow!=fast);
        fast = head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}

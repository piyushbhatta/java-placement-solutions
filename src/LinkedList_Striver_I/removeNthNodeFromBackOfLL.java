package LinkedList_Striver_I;

public class removeNthNodeFromBackOfLL {
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        ListNode a = new ListNode(11);
        ListNode b = new ListNode(12);
        ListNode c = new ListNode(13);
        head.next=a; a.next=b; b.next=c;

        ListNode.ListDisplay(head);
        ListNode newHead=removeNthFromEnd(head, 4);
        ListNode.ListDisplay(newHead);
    }
    public static ListNode removeNthFromEnd(ListNode head, int n){
        ListNode slow = head;
        ListNode fast = head;
        for(int i=1; i<=n; i++){
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}

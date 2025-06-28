package LinkedList_II;

public class isPalindrome {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(4);
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(4);
        head1.next=a; a.next=b; b.next=c; c.next=d;
        System.out.println(ifPalindrome(head1));
    }
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode nex = null;
        while(curr!=null){
            nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
        }
        return prev;
    }
    public static boolean ifPalindrome(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp=reverse(slow.next);
        ListNode p1 = head;
        ListNode p2 = temp;
        while (p2!=null){
            if(p1.val!=p2.val) return false;
            p1=p1.next;
            p2=p2.next;
        }
        return true;
    }
}

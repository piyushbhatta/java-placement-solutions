package LinkedList_I;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(2);
        ListNode a = new ListNode(4);
        ListNode b = new ListNode(3);
        head1.next=a; a.next=b;

        ListNode head2 = new ListNode(5);
        ListNode A = new ListNode(6);
        ListNode B = new ListNode(4);
        head2.next=A; A.next=B;

        ListNode sumHeadNode = addTwoNumbers(head1, head2);
        ListNode.ListDisplay(sumHeadNode);
    }
    public static ListNode reverse(ListNode head){
        ListNode current = head;
        ListNode previous = null;
        ListNode upcoming = null;
        while(current!=null){
            upcoming=current.next;
            current.next=previous;
            previous=current;
            current=upcoming;
        }
        return previous;
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        l1=reverse(l1);
        l2=reverse(l2);
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        int carry=0;
        while(l1!=null || l2!=null || carry!=0){
            int sum=carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }

            carry=sum/10;
            ListNode newNode = new ListNode(sum%10);
            curr.next=newNode;
            curr=curr.next;
        }
        return dummy.next;
    }
}

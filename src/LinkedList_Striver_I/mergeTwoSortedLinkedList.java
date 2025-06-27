package LinkedList_Striver_I;

public class mergeTwoSortedLinkedList {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(4);
        head1.next=a; a.next=b;

        ListNode head2 = new ListNode(1);
        ListNode A = new ListNode(3);
        ListNode B = new ListNode(4);
        head2.next=A; A.next=B;

        ListNode.ListDisplay(head1);
        ListNode.ListDisplay(head2);

        ListNode.ListDisplay(mergeSort(head1, head2));
    }
    public static ListNode mergeSort(ListNode head1, ListNode head2){
        ListNode temp1 = head1;
        ListNode temp2 = head2;
        ListNode newHead = new ListNode(100);
        ListNode temp = newHead;
        while(temp1!=null && temp2!=null){
            if(temp1.val<temp2.val){
                temp.next=temp1;
                temp=temp.next;
                temp1=temp1.next;
            }else{
                temp.next=temp2;
                temp=temp.next;
                temp2=temp2.next;
            }
        }
        while(temp1!=null){
            temp.next=temp1;
            temp=temp.next;
            temp1=temp1.next;
        }
        while(temp2!=null){
            temp.next=temp2;
            temp=temp.next;
            temp2=temp2.next;
        }
        return newHead.next;
    }
}

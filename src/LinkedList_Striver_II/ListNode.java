package LinkedList_Striver_II;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int val){
     this.val = val;
    }
    public static void display(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}

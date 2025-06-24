package LinkedList_Striver_I;

public class ListDisplay {
    public static void ListDisplay(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}

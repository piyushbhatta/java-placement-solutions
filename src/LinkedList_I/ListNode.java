package LinkedList_I;

class ListNode {
    int val;
    ListNode next;
    ListNode(){

    }
    ListNode(int Data){
        this.val =Data;
    }


    public static void ListDisplay(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}

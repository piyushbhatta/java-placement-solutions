package Learning_LinkedList_II;

public class LeetCode21_MergeTwoList {
    public static void main(String[] args) {

    }
    public static Node mergeTwoLists(Node list1, Node list2) {
        Node temp1 = list1;
        Node temp2 = list2;
        Node head = new Node();
        Node temp = head;
        while (temp1 != null && temp2 != null) {
            if (temp1.val < temp2.val) {
                Node newNode = new Node(temp1.val);
                temp.next = newNode;
                temp = temp.next;
                temp1 = temp1.next;
            } else {
                Node newNode = new Node(temp2.val);
                temp.next = newNode;
                temp = temp.next;
                temp2 = temp2.next;
            }
        }
        if (temp1 != null) {
            temp.next = temp1;
        }
        if (temp2 != null) {
            temp.next = temp2;
        }
        return head.next;
    }
    public static Node withoutExtraSpaceMergeSort(Node head1, Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        Node head = new Node();
        Node temp = head;
        while(temp1!=null && temp2!=null){
            if(temp1.val<temp2.val){
                temp.next=temp1;
                temp=temp1;
                temp1=temp1.next;
            }else{
                temp.next=temp2;
                temp=temp2;
                temp2=temp2.next;
            }
        }
        if(temp1!=null){
            temp.next=temp1;
        }
        if(temp2!=null){
            temp.next=temp2;
        }
        return head.next;
    }
}

package LinkedList_Striver_II;

public class reverseNodesInKGroup {
    public static void main(String[] args) {

    }
    public static ListNode reverse(ListNode head){
        ListNode current = head;
        ListNode previous = null;
        ListNode upcoming = null;
        while(current!=null){
            upcoming=current.next;
            current.next=previous;
            previous = current;
            current = upcoming;
        }
        return previous;
    }
    public static ListNode getKthNode(ListNode head, int k){
        ListNode temp = head;
        k-=1;
        while(temp!=null && k>0){
            temp=temp.next;
            k--;
        }
        return temp;
    }
    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevLast = null;
        while (temp != null) {
            ListNode kThNode = getKthNode(temp, k);
            if (kThNode == null) {
                if (prevLast != null) {
                    prevLast.next = temp;
                }
                break;
            }
            ListNode nextNode = kThNode.next;
            kThNode.next = null;
            reverse(temp);
            if (temp == head) {
                head = kThNode;
            } else {
                prevLast.next = kThNode;
            }
            prevLast = temp;
            temp = nextNode;
        }
        return head;
    }
}

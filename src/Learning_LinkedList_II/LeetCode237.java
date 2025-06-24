package Learning_LinkedList_II;

public class LeetCode237 {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public static void main(String[] args) {

    }
    public static void deleteNode(ListNode node){
        node.val=node.next.val;
        node.next=node.next.next;
    }
}

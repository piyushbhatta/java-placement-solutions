package Learning_LinkedList_II;

public class Leetcode234_isPalindrome {
    public static void main(String[] args) {

    }
    public static Node reverse(Node head){
        Node previous = null;
        Node Current = head;
        Node upComing = null;
        while(Current!=null){
            upComing=Current.next;
            Current.next=previous;
            previous=Current;
            Current=upComing;
        }
        return previous;
    }
    public static boolean isPalindromeOrNot(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node temp = reverse(slow.next);
        slow.next = temp;
        Node p1 = head;
        Node p2 = slow.next;
        while (p2 != null) {
            if (p1.val != p2.val) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
}

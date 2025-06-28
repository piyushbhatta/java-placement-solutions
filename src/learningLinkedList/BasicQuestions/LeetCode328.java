package learningLinkedList.BasicQuestions;
/// Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
///
/// The first node is considered odd, and the second node is even, and so on.
///
/// Note that the relative order inside both the even and odd groups should remain as it was in the input.
///
/// You must solve the problem in O(1) extra space complexity and O(n) time complexity.
public class LeetCode328 {
    public static void main(String[] args) {

    }
    public static Node oddEvenList(Node head){
        if (head == null || head.next == null) return head;

        Node headO = head;
        Node headE = head.next;
        Node odd = headO;
        Node even = headE;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = headE; // attach even list after odd list
        return headO;
    }
}

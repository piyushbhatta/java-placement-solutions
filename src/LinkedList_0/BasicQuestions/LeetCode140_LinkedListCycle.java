package LinkedList_0.BasicQuestions;

public class LeetCode140_LinkedListCycle {
    public static void main(String[] args) {
        Node Head = new Node(3);
        Node a = new Node(12);
        Node b = new Node(36);
        Node c = new Node(72);
        Node d = new Node(108);
        Node tail = new Node(216);
        // 3 12 36 72 108 36 72 108
        Head.next=a;
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=b;
        System.out.println(detectCycle(Head));
    }
    public static boolean detectCycle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}

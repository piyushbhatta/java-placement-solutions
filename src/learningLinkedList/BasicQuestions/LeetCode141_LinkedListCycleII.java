package learningLinkedList.BasicQuestions;

public class LeetCode141_LinkedListCycleII {
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
        System.out.println(startingOfCycle(Head).val);
    }
    public static Node startingOfCycle(Node head){
        Node slow = head;
        Node fast = head;
        do{
            if(fast==null || fast.next==null){
                return null;
            }
            slow=slow.next;
            fast=fast.next.next;
        }while(slow!=fast);
        fast = head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}

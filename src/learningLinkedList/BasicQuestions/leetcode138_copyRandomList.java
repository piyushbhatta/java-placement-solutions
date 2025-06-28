package learningLinkedList.BasicQuestions;

import java.util.HashMap;

public class leetcode138_copyRandomList {
    public static class Node{
        int val;
        Node next;
        Node random;
        Node(){

        }
        Node(int val){
            this.val=val;
        }
    }
    public static void main(String[] args) {

    }
    public static Node copyRandomListDeepCopy(Node head) {
        if (head == null) return null;

        HashMap<Node, Node> map = new HashMap<>();

        Node curr = head;
        while (curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        curr = head;
        while (curr != null) {
            Node copy = map.get(curr);
            copy.next = map.get(curr.next);
            copy.random = map.get(curr.random);
            curr = curr.next;
        }

        return map.get(head);
    }
}

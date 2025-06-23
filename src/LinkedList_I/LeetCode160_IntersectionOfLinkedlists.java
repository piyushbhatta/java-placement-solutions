package LinkedList_I;

public class LeetCode160_IntersectionOfLinkedlists {
    public static void main(String[] args) {
        Node Head = new Node(4);
        Node a = new Node(1);
        Node b = new Node(8);
        Node c = new Node(4);
        Node d = new Node(5);
        Head.next=a; a.next=b; b.next=c; c.next=d;
        Node Head1 = new Node(5);
        Node A = new Node(6);
        Node B = new Node(1);
        Head1.next=A; A.next=B; B.next=b;
        Display.display(Head);
        Display.display(Head1);
        System.out.println(getIntersectionNode(Head,Head1).val);;
    }
    public static Node getIntersectionNode(Node headA, Node headB){
        int m=0;
        int n=0;
        Node tempA = headA;
        Node tempB = headB;
        while(tempA!=null){
            m++;
            tempA=tempA.next;
        }
        while(tempB!=null){
            n++;
            tempB=tempB.next;
        }
        tempA = headA;
        tempB = headB;
        if(m>n){
            int steps = m-n;
            for(int i=0;i<steps;i++){
                tempA=tempA.next;
            }
        }else{
            int steps = n-m;
            for(int i=0;i<steps;i++){
                tempB=tempB.next;
            }
        }
        while(tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return tempA;
    }
}

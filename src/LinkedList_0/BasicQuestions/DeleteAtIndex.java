package LinkedList_0.BasicQuestions;

public class DeleteAtIndex {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next=b; b.next=c; c.next=d; d.next=e;
        Display.display(a);
        Display.display(delete(a,4));
    }
    public static Node delete(Node head, int index){
        if(index==0){
            head=head.next;
            return head;
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;

        return head;
    }
}

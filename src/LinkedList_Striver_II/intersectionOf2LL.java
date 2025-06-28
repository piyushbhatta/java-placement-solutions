package LinkedList_Striver_II;

public class intersectionOf2LL {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(4);
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(8);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(5);
        head1.next=a; a.next=b; b.next=c; c.next=d;

        ListNode head2 = new ListNode(5);
        ListNode a1 = new ListNode(6);
        ListNode b1= new ListNode(1);
        ListNode c1 = new ListNode(8);
        ListNode d1 = new ListNode(4);
        ListNode e1 = new ListNode(5);
        head2.next=a1; a1.next=b1; b1.next=b;

        ListNode.display(head1);
        ListNode.display(head2);
        System.out.println(intersectionPoint(head1,head2).val);
    }
    public static ListNode intersectionPoint(ListNode head1, ListNode head2){
        int m=0;//size of list1
        int n=0;//size of list2
        ListNode tempA = head1;
        while(tempA!=null){
            m++;
            tempA=tempA.next;
        }
        ListNode tempB = head2;
        while(tempB!=null){
            n++;
            tempB=tempB.next;
        }
        tempA=head1;
        tempB=head2;
        if(m>n){
            int skips = m-n;
            for(int i=0;i<skips;i++){
                tempA=tempA.next;
            }
        }
        if(n>m){
            int skips = n-m;
            for(int i=0;i<skips;i++){
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

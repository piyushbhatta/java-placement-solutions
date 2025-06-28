package learningLinkedList.BasicQuestions;

public class Display {
    public static void display(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}

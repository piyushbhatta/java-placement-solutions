package BitwiseManipulation;

public class Q7swapTwoNumbers {
    public static void main(String[] args) {
        int a = 6;
        int b = 5;
        System.out.println(a+" "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+" "+b);
    }
}

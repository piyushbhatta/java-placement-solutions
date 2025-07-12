package BitwiseManipulation;

public class Q5setTheRightMostBit {
    public static void main(String[] args) {
        System.out.println(setBit(6));
    }
    public static int setBit(int n) {
        return n | n+1;
    }
}

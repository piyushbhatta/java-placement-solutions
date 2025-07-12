package BitwiseManipulation;

public class Q2OddOrEven {
    public static void main(String[] args) {
        System.out.println(checkOdd(12));
    }
    public static boolean checkOdd(int n){
        return (n&1)==1;
    }
}

package bitwise.striver.questions;

public class Q3powerOf2 {
    public static void main(String[] args) {
        System.out.println(checkPower(8));
    }
    public static boolean checkPower(int n){
        return (n&(n-1))==0;
    }
}

package BitwiseManipulation;

public class Q1CheckBit_SetOrNor {
    public static void main(String[] args) {
        System.out.println(check(13,4));
    }
    public static boolean check(int n, int idx){
        if(n<=0){
            return false;
        }
        return (n & (1<<idx))!=0;
    }
}

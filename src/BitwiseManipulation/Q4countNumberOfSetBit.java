package BitwiseManipulation;

public class Q4countNumberOfSetBit {
    public static void main(String[] args) {
        System.out.println(noOfSetBit(15));
    }
    public static int noOfSetBit(int n){
        if(n==0) return 0;
        int count=0;
        while(n!=0){
            if(n%2==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
}

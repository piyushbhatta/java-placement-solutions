package BitwiseManipulation;

public class Q8DivideTwoInteger {
    public static void main(String[] args) {
        System.out.println(divide(17,3));
    }
    public static int divide(int dividend, int divisor){
        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        boolean isPositive = (dividend < 0) == (divisor < 0);
        long p = Math.abs(dividend);
        long q = Math.abs(divisor);
        int result = 0;
        while (p>=q){
            int count = 0;
            while(p>=(q<<(count+1))){
                count++;
            }
            result+=(1<<count);
            p=p-(q<<count);
        }
        return isPositive ? result : -result;
    }
}

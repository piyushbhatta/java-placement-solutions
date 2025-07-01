package mathsForDSA;

public class Q13divideWithoutDivideOp {
    public static void main(String[] args) {
        System.out.println(divide(22,3));
    }
    public static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        boolean isPositive = (dividend < 0) == (divisor < 0);

        long p = Math.abs((long) dividend);
        long q = Math.abs((long) divisor);
        int result = 0;

        while (p >= q) {
            int count = 0;
            while (p >= (q << (count + 1))) {
                count++;
            }
            result += (1 << count);
            p -= (q << count);
        }
        return isPositive ? result : -result;
    }
}

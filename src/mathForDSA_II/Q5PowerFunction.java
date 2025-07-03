package mathForDSA_II;

public class Q5PowerFunction {
    public static void main(String[] args) {
        System.out.println(pow(2,10));
    }
    static public double pow(double x, int n) {
        long N = n;

        boolean isNegative = N < 0;
        if (isNegative) {
            N = -N;
        }

        double ans = 1.0;
        while (N > 0) {
            if (N % 2 == 1) {
                ans *= x;
                N--;
            } else {
                x *= x;
                N /= 2;
            }
        }

        if (isNegative) {
            ans = 1.0 / ans;
        }

        return ans;
    }
}

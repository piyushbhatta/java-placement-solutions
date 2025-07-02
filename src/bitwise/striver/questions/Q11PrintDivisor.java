package bitwise.striver.questions;

import java.util.TreeSet;

public class Q11PrintDivisor {
    public static void main(String[] args) {

    }
    public static void print_divisors(int n) {
        TreeSet<Integer> divisors = new TreeSet<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
                divisors.add(n / i);
            }
        }

        for (int d : divisors) {
            System.out.print(d + " ");
        }
    }
}

package MathForDSA;

import java.util.Scanner;

public class checkForSetBit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = in.nextInt();
        System.out.print("check bit : ");
        int i = in.nextInt();
        System.out.println(isBitSet(a,i));
    }

    private static boolean isBitSet(int a, int i) {
        if((a & (1<<i))!=0){
            return true;
        }
        return false;
    }
}

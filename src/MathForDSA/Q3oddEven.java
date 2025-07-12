package MathForDSA;
import java.util.Scanner;
public class Q3oddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println();
        checkForOddEven(a);
    }

    private static void checkForOddEven(int a) {
        if((a&1)==1){
            System.out.println("Odd");
        }else{
            System.out.println("Even");        }
    }
}

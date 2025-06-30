package mathsForDSA;
import java.util.Scanner;
/// find the ith bit
public class findBit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int k=in.nextInt();
        System.out.print("Enter the index : ");
        int n=in.nextInt();
        System.out.println(find(k,n));
    }
    public static int find(int k, int n){
        return (k & (1<<(n-1)))>>(n-1);
    }
}

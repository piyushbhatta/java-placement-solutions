package mathsForDSA;

public class Q10checkForPowerOf2 {
    public static void main(String[] args) {
        System.out.println(powerCheck(32));
    }
    public static boolean powerCheck(int n){
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }
}

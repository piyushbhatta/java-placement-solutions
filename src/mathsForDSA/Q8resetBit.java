package mathsForDSA;

public class Q8resetBit {
    public static void main(String[] args) {
        System.out.println(reset(8,2));
    }
    public static int reset(int n, int idx){
        int mask1=1<<idx;
        return (n&(~mask1));
    }
}

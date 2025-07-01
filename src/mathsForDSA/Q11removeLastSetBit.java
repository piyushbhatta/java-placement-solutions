package mathsForDSA;

public class Q11removeLastSetBit {
    public static void main(String[] args) {
        System.out.println(remove(13));
        /// 13-1101
        /// after removing first(rightmost) set bit it will become 12(1100)
    }
    public static int remove(int n){
        return n&(n-1);
    }
}

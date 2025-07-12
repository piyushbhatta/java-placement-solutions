package MathForDSA;

/// find the ith bit
public class Q6findBit {
    public static void main(String[] args) {
        System.out.println(find(13,0));
        System.out.println(find(13,1));
        System.out.println(find(13,2));
        System.out.println(find(13,3));
        System.out.println(find(13,4));
        System.out.println(find(13,5));
    }
    public static int find(int n, int idx){
        return (n & (1<<(idx)))>>(idx);
    }
}

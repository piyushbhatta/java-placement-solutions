package MathForDSA;

public class Q9toggleBit {
    public static void main(String[] args) {
        System.out.println(toggle(12,3));
    }
    public static int toggle(int n, int idx){
        int mask = 1<<idx;
        return (n^mask);
    }
}

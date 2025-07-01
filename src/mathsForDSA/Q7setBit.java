package mathsForDSA;

public class Q7setBit {
    public static void main(String[] args) {
        System.out.println(set(13,1));
    }
    public static int set(int n, int idx){
        int mask = 1<<idx;
        return (n|mask);
    }
}

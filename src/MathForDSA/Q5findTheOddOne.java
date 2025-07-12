package MathForDSA;
/// Given an array in which each element comes twice except the Odd one, find that.
public class Q5findTheOddOne {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,3,1,4,7};
        System.out.println(uniqueOne(arr));
    }

    private static int uniqueOne(int[] arr) {
        int ans = 0;
        for(int a: arr){
            ans=ans^a;
        }
        return ans;
    }
}

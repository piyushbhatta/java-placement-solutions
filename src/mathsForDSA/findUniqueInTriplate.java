package mathsForDSA;

public class findUniqueInTriplate {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,4,4,3,3,5,4};
        System.out.println(unique(arr));
    }
    public static int unique(int[] arr){
        int ans=0;
        for(int a: arr){
            ans=ans + a;
        }
        return ans%3;
    }
}

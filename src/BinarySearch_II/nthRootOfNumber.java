package BinarySearch_II;

public class nthRootOfNumber {
    public static void main(String[] args) {
        System.out.println(nthRootOfM(3,64));
    }
    public static int nthRootOfM(int n, int m){
        int start= 1;
        int end= m;
        while(start<=end){
            int mid = start+(end-start)/2;
            int temp=pow(mid,n);
            if(temp==m){
                return mid;
            } else if (temp<m) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

    private static int pow(int mid, int n) {
        int ans=1;
        for (int i=1;i<=n;i++){
            ans*=mid;
        }
        return ans;
    }
}

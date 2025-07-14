package BinarySearch_II;

public class squareRoot {
    public static void main(String[] args) {
        System.out.println(squareR(17));
    }
    public static int squareR(int n){
        int start=1;
        int end=n;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(checkIf(n,mid)){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return end;
    }

    public static boolean checkIf(int n, int mid){
        if(mid*mid<=n){
            return true;
        }return false;
    }
}

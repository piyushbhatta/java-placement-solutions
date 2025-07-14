package BinarySearch_II;

import java.util.Arrays;

public class AggressiveCow {
    public static void main(String[] args) {
        int[] stalls = {10, 1, 2, 7, 5};
        int k=3;
        System.out.println(maximiseTheMinimum(stalls,k));
    }
    public static int maximiseTheMinimum(int[] stalls, int k){
        Arrays.sort(stalls);
        int start=1;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int stall:stalls){
            max=Math.max(max,stall);
            min=Math.min(min,stall);
        }
        int end=max-min;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(canWePlace(stalls,mid,k)){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return end;
    }
    public static boolean canWePlace(int[] stalls, int mid, int k){
        int CountCow=1;
        int last=stalls[0];
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-last>=mid){
                CountCow++;
                last=stalls[i];
            }
        }
        return CountCow>=k;
    }
}

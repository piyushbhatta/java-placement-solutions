package BinarySearchBeyondSheet;

import java.util.Arrays;

public class leetCode1482 {
    public static void main(String[] args) {
        int[] bloomDay={1,10,3,10,2};
        int m=3;
        int k=1;
        System.out.println(minDays(bloomDay,m,k));
    }
    public static int minDays(int[] bloomDay, int m, int k) {
        Arrays.sort(bloomDay);
        // if k=1, we need 1 adjacent flower for each bouquet
        // if k=2, we need 2 adjacent flower for each bouquet
        if(m*k>bloomDay.length){
            return -1;
        }
        int start = 0;
        int end = bloomDay.length-1;

        int result=-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(canMakeBouquets(bloomDay,mid,m,k)){
                result=bloomDay[mid];
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return result;
    }
    public static boolean canMakeBouquets(int[] arr, int mid, int k, int m){
        int count = 0;
        int tempCount=0;
        for(int i=0;i<arr.length;i++){
            if(tempCount==k) tempCount=0; count++;
            if(arr[i]>=arr[mid]){
                tempCount++;
            }
        }
        return count==m;
    }
}

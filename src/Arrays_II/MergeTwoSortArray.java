package Arrays_II;

import java.util.Arrays;

public class MergeTwoSortArray {
    public static void main(String[] args) {
        int[] arr1={1};
        int[] arr2={};
        inPlaceMerge(arr1,1,arr2,0);
        System.out.println(Arrays.toString(arr1));
    }
    public static int[] merge(int[] arr1, int[] arr2){
        int n= arr1.length;
        int m= arr2.length;
        int[] ans= new int[m+n];
        int i=0,j=0,k=0;
        while (i<n && j<m){
            if(arr1[i]>arr2[j]){
                ans[k++]=arr2[j++];
            }else{
                ans[k++]=arr1[i++];
            }
        }
        while(i<n){
            ans[k++]=arr1[i++];
        }
        while(j<m){
            ans[k++]=arr2[j++];
        }
        return ans;
    }
    public static void inPlaceMerge(int[] nums1, int m, int[] nums2, int n){
        int i= nums1.length-1;
        int j= n-1;
        if(n==0){
            return;
        }
        while(j>=0){
            int temp=nums1[i];
            nums1[i]=nums2[j];
            nums2[j]=temp;
            j--;
            i--;
        }
        Arrays.sort(nums1);
    }

    private static void shift(int[] arr1, int start) {
        for(int i=start+1;i<arr1.length;i++){
            arr1[i-1]=arr1[i];
        }
    }

}

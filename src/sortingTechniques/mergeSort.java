package sortingTechniques;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] nums = {2,1,4,3,7,5,6,9,8};
        System.out.println(Arrays.toString(nums));
        mergeSorting(nums,0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void mergeSorting(int[] nums, int low, int high){
        if(low<high){
            int mid = (low+(high-low)/2);

            mergeSorting(nums,low,mid);
            mergeSorting(nums,mid+1,high);

            merge(nums, low, mid, high);
        }
    }

    private static void merge(int[] nums, int low, int mid, int high) {
        int n1=mid-low+1;
        int n2=high-mid;

        int[] left = new int[n1];
        int[] right= new int[n2];

        for(int i=0;i<n1;i++){
            left[i]=nums[low+i];
        }
        for(int j=0;j<n2;j++){
            right[j]=nums[mid+1+j];
        }

        int i=0;
        int j=0;
        int k=low;
        while(i< n1 && j< n2){
            if(left[i]<right[j]){
                nums[k++]=left[i++];
            }else{
                nums[k++]=right[j++];
            }
        }
        while(i<left.length){
            nums[k++]=left[i++];
        }
        while(j<right.length){
            nums[k++]=right[j++];
        }
    }
}

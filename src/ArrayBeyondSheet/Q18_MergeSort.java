package ArrayBeyondSheet;

import java.util.Arrays;

public class Q18_MergeSort {
    public static void main(String[] args) {
        int[] nums = {4,2,1,6,7};
        mergeSort(nums,0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void mergeSort(int[] nums, int low, int high){
        if(low<high) {
            int mid = low + (high - low) / 2;

            mergeSort(nums,low,mid);
            mergeSort(nums,mid+1, high);

            merge(nums,low,mid,high);
        }
    }
    public static void merge(int[] nums, int low, int mid, int high){
        int n1=mid-low+1;
        int n2=high-mid;

        int[] left=new int[n1];
        int[] right=new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=nums[low+i];
        }
        for(int j=0;j<n2;j++){
            right[j]=nums[mid+1+j];
        }
        int i=0;
        int j=0;
        int k=low;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                nums[k++]=left[i++];
            }else{
                nums[k++]=right[j++];
            }
        }
        while(i<n1){
            nums[k++]=left[i++];
        }
        while(j<n2){
            nums[k++]=right[j++];
        }
    }
}

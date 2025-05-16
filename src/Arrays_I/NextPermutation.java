package Arrays_I;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr={1,3,2};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void nextPermutation(int[] nums) {
        int n= nums.length;
        int idx=-1;
        // Find BreakPoint
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }
        }
        // If No BreakPoint
        if(idx==-1){
            reverse(nums,0, nums.length-1);
            return;
        }
        //Find the Next Greater element then arr[idx]
        for(int i=n-1;i>idx;i--){
            if(nums[i]>nums[idx]){
                swap(nums,i,idx);
                break;
            }
        }
        reverse(nums,idx+1,nums.length-1);
    }
    //Reverse the rest of the elements
    private static void reverse(int[] nums, int i, int j) {
        int start=i;
        int end= j;
        for(int k=0;start<end;k++){
            swap(nums,start,end);
            start++;
            end--;
        }
    }

    private static void swap(int[] nums, int i, int idx) {
        int temp=nums[i];
        nums[i]=nums[idx];
        nums[idx]=temp;
    }
}

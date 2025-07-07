package KunalKushwahaBinarySearch;

import java.util.ArrayList;

public class Q6_pivotOfArray {
    public static void main(String[] args) {

    }
    public static int pivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        int pivot=-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid+1]<nums[mid]){
                pivot=mid;
            }
            if (nums[mid-1]>nums[mid]) {
                pivot=mid-1;
            }

            if(nums[mid]<=nums[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return pivot;
    }
}

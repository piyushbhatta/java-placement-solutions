package BinarySearch_I;

import java.util.Arrays;

public class firstAndLastOccurrenceOfNumber {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target=6;
        System.out.println(Arrays.toString(bound(nums,target)));
    }
    public static int[] bound(int[] nums, int target){
        int firstIdx = BinarySearchSpe(nums,target, true);
        int lastIdx= BinarySearchSpe(nums,target, false);
        return new int[]{firstIdx, lastIdx};
    }

    private static int BinarySearchSpe(int[] nums, int target, boolean firstElement) {
        int start=0;
        int end= nums.length-1;
        int bound=-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                bound=mid;
                if(firstElement){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            } else if (target>nums[mid]) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return bound;
    }
}

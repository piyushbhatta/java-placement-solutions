package ArrayBeyondSheet;

import java.util.ArrayList;
import java.util.Arrays;

public class Q5_NextPermutation {
    public static void main(String[] args) {
        int[] arr={1,3,2};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void nextPermutation(int[] nums) {
        int index = -1;
        int n = nums.length;
        // Find BreakPoint
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }
        //If idx=-1
        if (index == -1) {
            reverse(nums,0,n-1);
        }else{
            for(int i=n-1;i>index;i--){
                if(nums[i]>nums[index]){
                    swap(nums,i,index);
                    break;
                }
            }
            reverse(nums,index+1,n-1);
        }
    }
    public static void reverse(int[] nums, int start, int end){
        while(start<=end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
    public static void swap(int[] nums,int start, int end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
}

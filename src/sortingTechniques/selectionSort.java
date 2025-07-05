package sortingTechniques;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] nums = {2,1,4,3,7,5,6,9,8};
        System.out.println(Arrays.toString(nums));
        selectionSorting(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void selectionSorting(int[] nums){
        for(int i=0;i<nums.length;i++){
            int last = nums.length-i-1;
            int maxIndex = findMaxIndex(nums,0,last);

            swap(nums,last, maxIndex);
        }
    }

    private static void swap(int[] nums, int last, int maxIndex) {
        int temp = nums[last];
        nums[last]=nums[maxIndex];
        nums[maxIndex]=temp;
    }

    private static int findMaxIndex(int[] nums, int start, int last) {
        int max = 0;
        for(int i=0;i<=last; i++){
            if(nums[i]>nums[max]){
                max=i;
            }
        }
        return max;
    }
}

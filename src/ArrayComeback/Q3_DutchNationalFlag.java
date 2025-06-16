package ArrayComeback;

import java.util.Arrays;

public class Q3_DutchNationalFlag {
    public static void main(String[] args) {
        int[] nums={1,2,0};
        DNF(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void DNF(int[] nums){
        int start=0;
        int mid=0;
        int end= nums.length-1;
        while(mid<=end){
            switch (nums[mid]){
                case 0:
                    swap(nums,start,mid);
                    start++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums,mid,end);
                    end--;
            }
        }

    }
    public static void swap(int[] nums, int a, int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}

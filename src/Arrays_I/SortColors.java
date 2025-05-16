package Arrays_I;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums={1,2,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] nums) {
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

    public static void swap(int[] nums,int i, int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}

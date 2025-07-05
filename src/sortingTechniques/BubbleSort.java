package sortingTechniques;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {2,1,4,3,7,5,6,9,8};
        System.out.println(Arrays.toString(nums));
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void bubbleSort(int[] nums){
        int n = nums.length-1;
        for(int i=0;i<=n;i++){
            for(int j=0;j<n-i;j++){
                if(nums[j+1]<nums[j]){
                    int temp = nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
    }
}

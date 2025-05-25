package striver.arrays.beyondsheet;

import java.util.Arrays;

//Q.2149) Rearrange Array Elements by Sign
//https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
public class LeetCode_2149 {
    public static void main(String[] args) {
        int[] nums={3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(RearrangeArray(nums)));
    }
    //Better Approach
    public static int[] RearrangeArray(int[] nums){
        for(int i=0;i< nums.length;i++){
            if(i%2==0 && nums[i]<0){
                int p=i+1;
                while(p<nums.length && nums[p]<0){
                    p++;
                }
                rotate(nums,i,p);
            } else if (i%2!=0 && nums[i]>0) {
                int p=i+1;
                while(p< nums.length && nums[p]>0){
                    p++;
                }
                rotate(nums,i,p);
            }
        }
        return nums;
    }
    public static void rotate(int[] nums, int start, int end){
        reverse(nums,start,end);
        reverse(nums,start+1,end);
    }
    public static void reverse(int[] nums, int start, int end){
        while(start<=end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    public static void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    //Optimal Approach
    public static int[] rearrangeArray(int[] nums){
        int[] ans = new int[nums.length];
        int posIdx=0;
        int negIdx=1;
        for(int i=0;i< nums.length;i++){
            if(nums[i]>0){
                ans[posIdx]=nums[i];
                posIdx+=2;
            }else{
                ans[negIdx]=nums[i];
                negIdx+=2;
            }
        }
        return ans;
    }
}

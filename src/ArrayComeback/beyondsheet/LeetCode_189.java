package ArrayComeback.beyondsheet;
//Q.189) Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
//https://leetcode.com/problems/rotate-array/description/

import java.util.Arrays;

public class LeetCode_189 {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}

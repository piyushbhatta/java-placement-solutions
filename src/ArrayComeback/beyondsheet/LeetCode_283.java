package ArrayComeback.beyondsheet;
//https://leetcode.com/problems/move-zeroes/description/

//Q.283) Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//Note that you must do this in-place without making a copy of the array.
public class LeetCode_283 {
    public static void main(String[] args) {

    }
    public void moveZeroes(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}

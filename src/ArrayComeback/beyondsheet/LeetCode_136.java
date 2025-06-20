package ArrayComeback.beyondsheet;
//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//You must implement a solution with a linear runtime complexity and use only constant extra space.

//https://leetcode.com/problems/single-number/description/
public class LeetCode_136 {
    public static void main(String[] args) {

    }
    public static int singleNumber(int[] nums) {
        int xr=0;
        for(int i=0;i<nums.length;i++){
            xr=xr^nums[i];
        }
        return xr;
    }
}

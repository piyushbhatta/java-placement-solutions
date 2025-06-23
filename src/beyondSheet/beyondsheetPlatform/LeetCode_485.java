package beyondSheet.beyondsheetPlatform;
//Given a binary array nums, return the maximum number of consecutive 1's in the array.
//https://leetcode.com/problems/max-consecutive-ones/description/
public class LeetCode_485 {
    public static void main(String[] args) {

    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=1){
                count=0;
            }else{
                count++;
                max=Math.max(count,max);
            }
        }
        return max;
    }
}

package ArrayBeyondSheet.beyondsheetPlatform;

import java.util.HashSet;

public class LeetCode_268 {
    public static void main(String[] args) {
        int[] nums={1,0};

        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums){
        HashSet<Integer> map = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            map.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(!map.contains(i)){
                return i;
            }
        }
        return nums.length;
    }
}

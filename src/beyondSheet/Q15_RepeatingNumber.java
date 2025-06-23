package beyondSheet;

import java.util.Arrays;
import java.util.HashSet;

public class Q15_RepeatingNumber {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicates(nums));
    }
    public static int findDuplicate1(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            if(i!=0 && nums[i]==nums[i-1]){
                ans=nums[i];
            }
        }
        return ans;
    }

    public static int findDuplicate2(int[] nums){
        HashSet<Integer> Set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!Set.isEmpty() && Set.contains(nums[i])){
                return nums[i];
            }
            Set.add(nums[i]);
        }
        return -1;
    }
    public static int findDuplicates(int[] nums){
        int slow = nums[0];
        int fast = nums[0];
        do {
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);

        fast=nums[0];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
}

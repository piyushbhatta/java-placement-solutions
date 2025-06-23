package beyondSheet;

public class Q16_FloydsTortoiseAndHareAlgorithm {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicates(nums));
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

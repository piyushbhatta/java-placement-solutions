package Arrays_IV;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(OptimalSoln(nums));
    }
    public static int NaiveApproach(int[] nums){
        Arrays.sort(nums);
        int longest=1;
        int count=0;
        int lastSmall=Integer.MIN_VALUE;
        for(int i=0;i< nums.length;i++){
            if (nums[i]-1==lastSmall) {
                count++;
                lastSmall=nums[i];
            } else if (nums[i]!=lastSmall) {
                count=1;
                lastSmall=nums[i];
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }

    public static int OptimalSoln(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i< nums.length;i++){
            set.add(nums[i]);
        }
        int longest=1;
        for(int a:set){
            if(!set.contains(a-1)){
                int count=1;
                int x=a;
                while(set.contains(x+1)){
                    x=x+1;
                    count++;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}

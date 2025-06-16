package ArrayComeback;

import java.util.Arrays;

public class Q2_MaximumSumSubarray {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(Arrays.toString(subArray(nums)));
    }
    public static int[] subArray(int[] nums){
        int max=Integer.MIN_VALUE;
        int rStart=0;
        int sum=0;
        int tempStart=0;
        int rEnd= nums.length;
        for(int i=0;i<nums.length;i++){
            if(sum<0) {
                sum=0;
                tempStart=i;
            }
            sum+=nums[i];
            if(sum>max){
                max=sum;
                rStart=tempStart;
                rEnd=i;
            }
        }
        int[] ans = new int[rEnd-rStart+1];
        int k=0;
        for(int i=rStart;i<=rEnd;i++){
            ans[k]=nums[i];
            k++;
        }
        return ans;
    }
}

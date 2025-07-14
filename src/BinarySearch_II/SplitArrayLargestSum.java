package BinarySearch_II;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums={7,2,5,10,8};
        System.out.println(minOfLargestSum(nums,2));
    }
    public static int minOfLargestSum(int[] nums, int k){
        int start=nums[0];
        int end=nums[0];
        for(int i=1;i< nums.length;i++){
            start=Math.max(start,nums[i]);
            end+=nums[i];
        }
        while(start<end){
            int mid=start+(end-start)/2;
            int sum=0;
            int pieces=1;
            for (int num:nums){
                if(sum+num>mid){
                    pieces++;
                    sum=num;
                }else{
                    sum+=num;
                }
            }
            if(pieces<=k){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return end;
    }
}

package BinarySearch_II;

public class SmallestDivisorGivenAThreshold {
    public static void main(String[] args) {
        int[] nums={44,22,33,11,1};
        int threshold=5;
        System.out.println(smallestDivisor(nums,threshold));
    }
    public static int smallestDivisor(int[] nums, int threshold){
        int start=1;
        int end=nums[0];
        for(int n:nums){
            end=Math.max(n,end);
        }
        while (start<=end){
            int mid=start+(end-start)/2;
            if(checkForThreshold(nums,mid,threshold)){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
    public static boolean checkForThreshold(int[] nums, int mid, int threshold){
        int sum=0;
        for(int n:nums){
            sum+=(n+mid-1)/mid;
        }
        return sum<=threshold;
    }
}

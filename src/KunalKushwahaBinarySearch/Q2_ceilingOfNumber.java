package KunalKushwahaBinarySearch;

public class Q2_ceilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(ceiling(arr,15));
    }
    public static int ceiling(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                return nums[mid];
            } else if (target>nums[mid]) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return nums[start];
    }
}

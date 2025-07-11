package BinarySearch_I;

public class FloorOfTarget {
    public static void main(String[] args) {
        int[] nums = {1,3,4,6,12,24,45,67,78,90};
        int target=-1;
        System.out.println(floorOf(nums,100));
    }
    public static int floorOf(int[] nums, int target){
        int start=0;
        int end= nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return nums[mid];
            } else if (target>nums[mid]) {
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        if(end<0){
            return -1;
        }
        return nums[end];
    }
}

package BinarySearch_I;

public class searchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target=100;
        System.out.println(searchInsert(nums,target));
    }
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end= nums.length-1;
        int n=nums.length;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}

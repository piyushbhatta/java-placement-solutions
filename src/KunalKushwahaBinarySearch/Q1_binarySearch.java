package KunalKushwahaBinarySearch;

public class Q1_binarySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(binarySearch(arr,2));
    }
    public static int binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        // Start<end tak loop chalega to start==end wala condition check hi nhi hoga
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                return mid;
            } else if (nums[mid]>target) {
                end=mid-1;
            }else{
                start=mid+1;// for s=5 and e=6 mid is always 5 and the loop will never terminate
            }
        }
        return -1;
    }
}

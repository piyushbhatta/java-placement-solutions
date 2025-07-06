package KunalKushwahaBinarySearch;



public class Q4_binarySearchInfiniteArray {
    public static void main(String[] args) {

    }
    public static int binarySearchRange(int[] nums, int target){
        int start=0;
        int end =1;
        while(target>nums[end]){
            int newStart=end+1;
            end=end+(end-start+1)*2;
            start=newStart;
        }
        return binarySearch(nums, target, start, end);
    }
    public static int binarySearch(int[] nums, int target, int start, int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            } else if (target>nums[mid]) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}

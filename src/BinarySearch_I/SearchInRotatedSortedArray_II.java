package BinarySearch_I;

public class SearchInRotatedSortedArray_II {
    public static void main(String[] args) {
        int[] nums={2,5,6,0,0,1,2};
        int target=3;
        System.out.println(inRotatedArray(nums,target));
    }
    public static boolean inRotatedArray(int[] nums, int target){
        int idx=-1;
        int pivot=pivot(nums);
        idx=binarySearch(nums,target,0,pivot);
        if(idx==-1){
            idx=binarySearch(nums,target,pivot+1, nums.length-1);
        }
        return idx!=-1;
    }
    public static int binarySearch(int[] nums, int target, int start, int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }else if(target>nums[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    private static int pivot(int[] nums) {
        int start=0;
        int n=nums.length;
        int end= n-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid+1<n && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid-1>0 && nums[mid-1]>nums[mid]){
                return mid-1;
            }
            if (nums[start]==nums[mid] && nums[mid]==nums[end]) {
                if(start<end && nums[start+1]<nums[start]){
                    return start;
                }
                if(end>0 && nums[end-1]>nums[end]){
                    return end-1;
                }
                start++;
                end--;
            }
            if(nums[start]<nums[mid] || (nums[start]==nums[mid] && nums[mid]>nums[end])){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}

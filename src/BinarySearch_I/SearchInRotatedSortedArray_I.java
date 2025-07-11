package BinarySearch_I;

public class SearchInRotatedSortedArray_I {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target=0;
        System.out.println(searchInRotatedArray(nums,target));
    }
    public static int searchInRotatedArray(int[] nums, int target){
        int idx = -1;
        int pivot=pivotOfArray(nums);
        idx=binarySearch(nums,target,0,pivot);
        if(idx==-1){
            idx=binarySearch(nums,target,pivot+1, nums.length-1);
        }
        return idx;
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
    public static int pivotOfArray(int[] nums){
        int start=0;
        int end= nums.length-1;
        int n= nums.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid+1<n && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid-1>0 && nums[mid-1]>nums[mid]){
                return mid-1;
            }
            if(nums[mid]<nums[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}

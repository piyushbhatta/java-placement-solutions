package BinarySearch_I;

public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,8,7,6};
        System.out.println(searchInMountain(arr,9));
    }
    public static int searchInMountain(int[] nums, int target){
        int peak=peakOf(nums);
        int idx=OrdinaryBinarySearch(nums,target,0,peak);
        if(idx==-1){
            idx=OrdinaryBinarySearch(nums,target,peak+1, nums.length-1);
        }
        return idx;
    }
    public static int OrdinaryBinarySearch(int[] nums, int target, int start, int end){
        if(nums[start]<nums[end]){
            // Array is in the Ascending Order{1,2,3,4,5,6,7,8,9}
            while(start<=end){
                int mid = start+(end-start)/2;
                if(nums[mid]==target){
                    return mid;
                } else if (target>nums[mid]) {
                    start=mid+1;
                }else {
                    end=mid-1;
                }
            }
        }
        else{
            // Array is in the Descending Order{9,8,7,6,5,4,3,2,1}
            while(start<=end){
                int mid = start+(end-start)/2;
                if(nums[mid]==target){
                    return mid;
                } else if (target>nums[mid]) {
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
        }
        return -1;
    }
    public static int peakOf(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return start;
    }
}

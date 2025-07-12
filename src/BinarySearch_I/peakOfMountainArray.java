package BinarySearch_I;

public class peakOfMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,1};
        System.out.println(peakOf(arr));
    }
    public static int peakOf(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]<nums[mid+1]){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return end;
    }
}

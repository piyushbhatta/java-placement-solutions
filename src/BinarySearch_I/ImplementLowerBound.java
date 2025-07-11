package BinarySearch_I;
/// Given a sorted array arr[] and a number target, the task is to
/// find the lower bound of the target in this given array.
/// The lower bound of a number is defined as the smallest index in the sorted array
/// where the element is greater than or equal to the given number.
/// Note: If all the elements in the given array are smaller than the target,
/// the lower bound will be the length of the array.
/// Repeated Number is Allowed
public class ImplementLowerBound {
    public static void main(String[] args) {
        int[] nums = {2, 3, 7, 10, 11, 11, 25};
        int target=11;
        System.out.println(lowerBound(nums,target));
    }
    public static int lowerBound(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        int result=-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]==target){
                result=mid;
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        if(result!=-1){
            return result;
        }
        if(end>arr.length){
            return arr[arr.length-1];
        }
        return start;
    }
}

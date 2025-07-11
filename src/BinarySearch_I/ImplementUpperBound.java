package BinarySearch_I;
/// Given a sorted array arr[] and a number target,
/// the task is to find the upper bound of the target in this given array.
/// The upper bound of a number is defined as the
/// smallest index in the sorted array where the element is greater than the given number.
/// Note: If all the elements in the given array are
/// smaller than or equal to the target, the upper bound will be the length of the array.
public class ImplementUpperBound {
    public static void main(String[] args) {
        int[] nums = {2, 3, 7, 10, 11, 11, 25};
        int target=9;
        System.out.println(upperBound(nums,target));
    }
    public static int upperBound(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if (target>=arr[mid]) {
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        if(end>arr.length){
            return arr[arr.length-1];
        }
        return start;
    }
}

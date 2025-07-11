package BinarySearch_I;

public class CountOccurrenceOfNumberInSortedArray {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target=8;
        System.out.println(countOccurrence(nums,target));
    }
    public static int countOccurrence(int[] nums, int target){
        int firstIdx = BinarySearchSpe(nums,target, true);
        int lastIdx= BinarySearchSpe(nums,target, false);
        if(firstIdx==-1 || lastIdx==-1){
            return 0;
        }
        return lastIdx-firstIdx+1;
    }
    private static int BinarySearchSpe(int[] nums, int target, boolean firstElement) {
        int start=0;
        int end= nums.length-1;
        int bound=-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                bound=mid;
                if(firstElement){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            } else if (target>nums[mid]) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return bound;
    }
}

package KunalKushwahaBinarySearch;

public class Q3_floorOfNumber {
    public static void main(String[] args) {
        int[] nums = {2,3,5,9,14,16,18};
        System.out.println(floor(nums, 8));
        char[] letters = {'c','f','j'};
        if(letters[0]>letters[1]){
            System.out.println(letters[0]);
        }
    }
    public static int floor(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                return nums[mid];
            }else if(target>nums[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return nums[end];
    }
}

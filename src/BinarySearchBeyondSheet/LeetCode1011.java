package BinarySearchBeyondSheet;

public class LeetCode1011 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(shipWithinDays(nums,5));
    }
    public static int shipWithinDays(int[] weights, int days) {
        int start=weights[0];
        int end=weights[0];
        for(int i=1;i<weights.length;i++){
            start=Math.max(start, weights[i]);
            end+=weights[i];
        }
        while(start<=end){
            int mid = start+(end-start)/2;
            int dayReq=Days(weights, mid);
            if(dayReq<=days){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
    public static int Days(int[] weights, int mid){
        int days=1; int load=0;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>mid){
                days++;
                load=weights[i];
            }else{
                load+=weights[i];
            }
        }
        return days;
    }
}

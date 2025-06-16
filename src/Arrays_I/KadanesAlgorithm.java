package Arrays_I;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(MaximumSubarray(nums));
    }
    public static int MaximumSubarray(int[] nums){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for (int num : nums) {
            if (sum < 0) sum = 0;
            sum += num;
            max = Math.max(max, sum);
        }
        return max;
    }
}

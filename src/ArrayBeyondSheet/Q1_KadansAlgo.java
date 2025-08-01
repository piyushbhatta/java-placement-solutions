package ArrayBeyondSheet;

public class Q1_KadansAlgo {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(Kadans(nums));
    }
    public static int Kadans(int[] nums){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum<0) sum=0;
            sum+=nums[i];
            max=Math.max(max,sum);
        }
        return max;
    }
}

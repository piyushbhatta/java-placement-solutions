package ArrayComeback;

public class Q4_BuySellStocks {
    public static void main(String[] args) {
        int[] nums={7,6,4,3,1};
        System.out.println(maxProfit(nums));
    }
    public static int maxProfit(int[] nums){
        int miniSoFar=nums[0];
        int diff=Integer.MIN_VALUE;
        for(int i=0;i< nums.length;i++){
            miniSoFar=Math.min(nums[i],miniSoFar );
            diff=Math.max(diff,nums[i]-miniSoFar);
        }
        return diff;
    }
}

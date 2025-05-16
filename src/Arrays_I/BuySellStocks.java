package Arrays_I;

public class BuySellStocks {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices) {
        int max=0;
        int diff=0;
        for(int i=1;i<prices.length;i++){
            int min = min(prices,0,i-1);
            diff=prices[i]-min;
            max=Math.max(max,diff);
        }
        return max;
    }
    public int min(int[] nums, int start, int end){
        int min=0;
        for(int i=start;i<=end;i++){
            if(nums[i]<nums[min]){
                min=i;
            }
        }
        return nums[min];
    }
    public static int Max_profit_Optimal_Sol(int[] Prices) {
        int Min_so_far = Prices[0];
        int res = 0;

        for(int i = 0; i < Prices.length; ++i) {
            Min_so_far = Math.min(Min_so_far, Prices[i]);
            res = Math.max(res, Prices[i] - Min_so_far);
        }

        return res;
    }
}

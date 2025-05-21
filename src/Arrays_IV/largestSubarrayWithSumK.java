package Arrays_IV;

import java.util.HashMap;

public class largestSubarrayWithSumK {
    public static void main(String[] args) {

    }
    public static int LargestSubarrayWithSumK(int[] arr, int k){
        int maxLength=0;
        int n= arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+= arr[i];

            if(sum==k){
                maxLength=i+1;
            }

            if (map.containsKey(sum - k)) {
                maxLength = Math.max(maxLength, i - map.get(sum - k));
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i); // store first occurrence only
            }
        }
        return maxLength;
    }
}

package Arrays_IV;

import java.util.HashMap;

public class largestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] arr={-5, 8, -14, 2, 4, 12};
        System.out.println(BetterApproach(arr, -5));
    }
    public static int NaiveApproach(int[] arr, int k){

        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                int count=0;
                for(int l=i;l<=j;l++){
                    sum=sum+arr[l];
                    count++;
                }
                if(sum==k){
                    max=Math.max(count,max);
                }
            }
        }
        return max;
    }

    public static int BetterApproach(int[] arr, int k){
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];

                if(sum==k){
                    max=Math.max(max,j-i+1);
                }
            }
        }
        return max;
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

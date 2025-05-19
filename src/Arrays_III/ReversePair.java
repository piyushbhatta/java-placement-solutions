package Arrays_III;

import java.util.Arrays;

public class ReversePair {
    public static void main(String[] args) {
        int[] nums ={2,4,3,5,1};
        System.out.println(reversePairs(nums));
        System.out.println(Arrays.toString(nums));
    }
    public static int reversePairs(int[] nums){
        return sort(nums,0,nums.length-1);
    }
    public static int sort(int[] nums, int low, int high){
        int count=0;
        if(low<high){
            int mid=low+(high-low)/2;

            count=count+sort(nums, low, mid);
            count=count+sort(nums, mid+1, high);

            count=count+countPairs(nums, low, mid , high);
            merge(nums, low, mid, high);
        }
        return count;
    }

    private static int countPairs(int[] nums, int low, int mid, int high) {
        int right=mid+1;
        int count=0;
        for(int i=low;i<=mid;i++){
            while(right<= high && nums[i]>2*nums[right]) right++;
            count=count+(right-(mid+1));
        }
        return count;
    }

    public static void merge(int[] nums, int low, int mid, int high){
        int n1=mid-low+1;
        int n2=high-mid;

        int[] left= new int[n1];
        int[] right= new int[n2];

        for(int i=0;i<n1;i++){
            left[i]=nums[low+i];
        }
        for(int j=0;j<n2;j++){
            right[j]=nums[j+mid+1];
        }
        int i=0, j=0, k=low;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                nums[k++]=left[i++];
            }else{
                nums[k++]=right[j++];
            }
        }
        while(i<n1){
            nums[k++]=left[i++];
        }
        while(j<n2){
            nums[k++]=right[j++];
        }
    }
}

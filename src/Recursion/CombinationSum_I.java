package Recursion;

import java.util.ArrayList;

public class CombinationSum_I {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        int target=7;
        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
        Solution(arr,target,0 , ans, new ArrayList<Integer>());
        System.out.println(ans);
    }
    public static void Solution(int[] arr, int target, int idx, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> list){
        if(idx==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(arr[idx]<=target){
            list.add(arr[idx]);
            Solution(arr, target-arr[idx], idx, ans, list);
            list.removeLast();
        }
        Solution(arr, target, idx+1, ans, list);
    }
}

package Recursion;

import java.util.ArrayList;

public class CombinationSum_II {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int target=4;
        Solution(arr, target, 0, ans, new ArrayList<>());
        System.out.println(ans);
    }
    public static void Solution(int[] arr, int target, int idx, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> list){
        if(target==0) ans.add(new ArrayList<>(list));
        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i-1]==arr[i]) continue;
            if(arr[i]>target) break;

            list.add(arr[i]);
            Solution(arr, target, idx+1, ans, list);
            list.removeLast();
        }
    }
}

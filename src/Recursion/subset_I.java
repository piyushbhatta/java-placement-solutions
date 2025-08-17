package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class subset_I {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<Integer> ans = new ArrayList<>();
        int sum=0;
        subsetSum(arr,0,sum, ans);
        Collections.sort(ans);
        System.out.println(ans);
    }
    public static void subsetSum(int[] arr, int idx, int sum,  ArrayList<Integer> list){
        if(idx == arr.length){
            list.add(sum);
            return;
        }
        subsetSum(arr, idx+1, sum+arr[idx], list);
        subsetSum(arr, idx+1, sum, list);
    }
}

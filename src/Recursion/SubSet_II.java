package Recursion;

import java.util.ArrayList;

public class SubSet_II {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(powerSet(arr));
    }
    public static ArrayList<ArrayList<Integer>> powerSet(int[] arr){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        OptimalSol(arr,0, ans, new ArrayList<>());
        return ans;
    }
    public static ArrayList<ArrayList<Integer>> BruteSolution(int[] arr ){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                ArrayList<Integer> list = new ArrayList<>();
                for(int k=i;k<=j;k++){
                    list.add(arr[k]);
                }
                ans.add(list);
            }
        }
        return ans;
    }
    public static void OptimalSol(int[] arr, int idx, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> list){
        ans.add(new ArrayList<>(list));
        for(int i=idx; i<arr.length;i++){
            if(i>idx && arr[i-1]==arr[i]) continue;
            list.add(arr[i]);
            OptimalSol(arr, i+1,ans,list);
            list.removeLast();
        }
    }
}

package Recursion;
import java.util.ArrayList;

public class printCombination {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        boolean[] freq = new boolean[arr.length];
        solution(arr, ans, new ArrayList<>(), freq);
        System.out.println(ans);
    }
    public static void solution(int[] arr, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> list, boolean[] freq){
        if(list.size()== arr.length){
            ans.add(new ArrayList<>(list));
        }
        for(int i=0;i<arr.length;i++){
            if(!freq[i]){
                freq[i]=true;
                list.add(arr[i]);
                solution(arr,ans,list,freq);
                list.removeLast();
                freq[i]=false;
            }
        }
    }
}

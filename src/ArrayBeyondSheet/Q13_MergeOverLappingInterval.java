package ArrayBeyondSheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q13_MergeOverLappingInterval {
    public static void main(String[] args) {
        int[][] intervals={{1,3},{2,6},{8,10},{15,18}};
        System.out.println(mergeOverLapping(intervals));
    }
    public static List<List<Integer>> mergeOverLapping(int[][] Intervals){
        Arrays.sort(Intervals, Comparator.comparingInt(a -> a[0]));
        int n= Intervals.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(ans.isEmpty() || Intervals[i][0]>ans.getLast().getLast()){
                ans.add(Arrays.asList(Intervals[i][0],Intervals[i][1]));
            }else{
                ans.getLast().set(1,Math.max(ans.getLast().getLast(),Intervals[i][1]));
            }
        }
        return ans;
    }
}


package Arrays_II;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class MergeInterval {
    public static void main(String[] args) {
        int[][] intervals={{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
    public static int[][] merge(int[][] intervals){
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0] ));
        int n= intervals.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(ans.isEmpty() || intervals[i][0]>ans.get(ans.size()-1).get(1)){
                ans.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            }else{
                ans.get(ans.size() - 1).set(1, Math.max(ans.get(ans.size() - 1).get(1), intervals[i][1]));
            }
        }
        int[][] ans1= new int[ans.size()][];
        for(int i=0;i< ans.size();i++){
            ans1[i] = new int[ans.get(i).size()];
            for(int j=0;j<ans.get(i).size();j++){
                ans1[i][j]=ans.get(i).get(j);
            }
        }
        return ans1;
    }
}

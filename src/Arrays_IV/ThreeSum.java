package Arrays_IV;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        System.out.println(OptimalApp(nums));
    }


    //Naive Approach
    public static List<List<Integer>> threeSum(int[] nums){
        int n=nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<HashSet<Integer>> set = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0) {
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        Collections.sort(list);
                        HashSet<Integer> set1 = new HashSet<>(list);
                        if(!set.contains(set1)) {
                            ans.add(list);
                            set.add(set1);
                        }
                    }
                }
            }
        }
        return ans;
    }


    // Better Approach
    public static List<List<Integer>> three3Sum(int[] nums){
        int n= nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> hashSet= new HashSet<>();
        int target=0;
        for(int i=0;i< nums.length;i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third=target-nums[i]-nums[j];
                if(set.contains(third)){
                    List<Integer> list = Arrays.asList(nums[i], nums[j], third);
                    Collections.sort(list);
                    if(!hashSet.contains(list)) {
                        ans.add(list);
                        hashSet.add(list);
                    }
                }
                set.add(nums[j]);
            }
        }
        return ans;
    }

    //Optimal Approach
    public static List<List<Integer>> OptimalApp(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i< nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int p=i+1;
            int q=nums.length-1;

            while(p<q) {
                if (nums[i] + nums[p] + nums[q] > 0) {
                    q--;
                }
                else if (nums[i] + nums[p] + nums[q] < 0) {
                    p++;
                }
                else {
                    List<Integer> list = Arrays.asList(nums[i], nums[p], nums[q]);
                    ans.add(list);
                    p++;
                    q--;
                    while(p<q && nums[p]==nums[p-1]) p++;
                    while(p<q && q!= nums.length-1 && nums[q]==nums[q+1]) q--;
                }
            }
        }
        return ans;
    }
}

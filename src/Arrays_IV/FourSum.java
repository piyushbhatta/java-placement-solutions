package Arrays_IV;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class FourSum {
    public static void main(String[] args) {

    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            while(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<n;j++){
                while(j>1 && nums[j]==nums[j-1]) continue;
                int p=j+1;
                int q=n-1;
                while(p<q){
                    if(nums[i]+nums[j]+nums[p]+nums[q]<target)
                    {
                        p++;
                    }else if(nums[i]+nums[j]+nums[p]+nums[q]>target){
                        q--;
                    }else{
                        List<Integer> list = Arrays.asList(nums[i], nums[j], nums[p], nums[q]);
                        ans.add(list);
                        p++;
                        q--;
                        while(p<q && nums[p]==nums[p-1]) p++;
                        while(p<q && q!=n-1 && nums[q]==nums[q+1]) q--;
                    }
                }
            }
        }
        return ans;
    }
}

package Arrays_II;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumber {
    public static void main(String[] args) {

    }
    public static int findDuplicate(int[] nums){
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i=0;i< nums.length;i++){
            freq.put(nums[i], freq.getOrDefault(nums[i],0)+1 );
        }
        int ans=0;
        for(Map.Entry<Integer,Integer> entry: freq.entrySet()){
            if(entry.getValue()>1){
                entry.getKey();
            }
        }
        return ans;
    }
}

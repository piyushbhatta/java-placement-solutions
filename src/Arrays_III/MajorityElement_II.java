package Arrays_III;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
public class MajorityElement_II {
    public static void main(String[] args) {

    }
    public static List<Integer> majorityElement(int[] nums){
        HashMap<Integer, Integer> freq = new HashMap<>();
        int n=nums.length;
        List<Integer> maj=new ArrayList<>();
        for(int i=0;i<n;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            if(entry.getValue()>n/3){
                maj.add(entry.getKey());
            }
        }
        return maj;

    }
}

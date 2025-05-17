package Arrays_III;
import java.util.HashMap;
import java.util.Map;
public class MajorityElement_I {
    public static void main(String[] args) {

    }
    public static int majorityElement(int[] nums){
        HashMap<Integer, Integer> freq = new HashMap<>();
        int n=nums.length;
        int maj=nums[0];
        for(int i=0;i<n;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            if(entry.getValue()>n/2){
                maj=entry.getKey();
            }
        }
        return maj;
    }
}

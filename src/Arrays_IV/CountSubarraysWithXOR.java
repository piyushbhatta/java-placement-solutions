package Arrays_IV;
import java.util.HashMap;
public class CountSubarraysWithXOR {
    public static void main(String[] args) {

    }
    public static long subarrayXor(int arr[], int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int xor = 0;

        for (int num : arr) {
            xor ^= num;

            if (xor == k) {
                count++;
            }

            int required = xor ^ k;
            count += map.getOrDefault(required, 0);

            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }

        return count;
    }
}

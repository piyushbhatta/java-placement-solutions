package _LeetCodeDailyQuestion;

import java.util.HashMap;
import java.util.Map;

public class Day7_LeetCode1865 {
    public static void main(String[] args) {

    }
    static class FindSumPairs {
        private int[] nums1;
        private int[] nums2;
        private Map<Integer, Integer> freqMap2;

        public FindSumPairs(int[] nums1, int[] nums2) {
            this.nums1 = nums1;
            this.nums2 = nums2;
            freqMap2 = new HashMap<>();
            for (int num : nums2) {
                freqMap2.put(num, freqMap2.getOrDefault(num, 0) + 1);
            }
        }

        public void add(int index, int val) {
            int oldVal = nums2[index];
            int newVal = oldVal + val;

            freqMap2.put(oldVal, freqMap2.get(oldVal) - 1);
            if (freqMap2.get(oldVal) == 0) {
                freqMap2.remove(oldVal);
            }
            freqMap2.put(newVal, freqMap2.getOrDefault(newVal, 0) + 1);

            nums2[index] = newVal;
        }

        public int count(int tot) {
            int count = 0;
            for (int num1 : nums1) {
                int complement = tot - num1;
                count += freqMap2.getOrDefault(complement, 0);
            }
            return count;
        }
    }
}

package StacksBeyondSheet.LeetCode;

import java.util.Arrays;
import java.util.Stack;

public class MaximumErasureValue {
    public static void main(String[] args) {
        int[] nums = {4,2,4,5,6};
        System.out.println(Arrays.toString(maximumUniqueSubarray(nums)));
    }
    public static int[] maximumUniqueSubarray(int[] nums) {
        int[] lastOccurence = new int[nums.length];
        lastOccurence[0] = -1;
        Stack<Integer> st = new Stack<>();
        st.push(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            while (!st.isEmpty() && st.peek() == nums[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                lastOccurence[i] = -1;
            } else {
                lastOccurence[i] = st.peek();
            }
            st.push(nums[i]);
        }
        return lastOccurence;
    }
}

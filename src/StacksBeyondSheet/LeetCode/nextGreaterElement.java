package StacksBeyondSheet.LeetCode;

import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
    }
    public int[] nextGreaterElements(int[] nums1, int[] nums2) {
        int n=nums2.length;
        Stack<Integer> st = new Stack<>();
        int[] nG= new int[n];
        nG[n-1]=-1;
        st.push(nums2[n-1]);
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums2[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nG[i]=-1;
            }else{
                nG[i]=st.peek();
            }
            st.push(nums2[i]);
        }
        int[] res = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    res[i]=nG[j];
                }
            }
        }
        return res;
    }
}

package StacksBeyondSheet.LeetCode;

import java.util.Stack;

public class fancyString {
    public static void main(String[] args) {
        String str = "leetcode";
        System.out.println(makeFancyString(str));
    }
    public static String makeFancyString(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (st.isEmpty() || st.peek() != s.charAt(i)) {
                st.push(s.charAt(i));
                count = 1;
            } else if (st.peek() == s.charAt(i)) {
                if (count == 2) {
                    continue;
                } else {
                    st.push(s.charAt(i));
                    count++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : st) sb.append(c);

        return sb.toString();
    }
}

package StringLoveBabbar;

import java.util.Stack;

public class reverseString {
    public static void main(String[] args) {
        System.out.println(reverseUsingStack("Geeks"));
    }
    public static String reverseString(String s){
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        return rev;
    }
    public static String reverseS(String s){
        StringBuilder sb = new StringBuilder(s);
        int start=0;
        int end=s.length()-1;
        while(start<end){
            char temp=sb.charAt(start);
            sb.setCharAt(start,sb.charAt(end));
            sb.setCharAt(end,temp);
            start++;
            end--;
        }
        return sb.toString();
    }
    public static String reverseUsingStack(String s){
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
        }
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.toString();
    }
}

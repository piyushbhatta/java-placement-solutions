package StringLoveBabbar;

import java.util.Arrays;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
            String s1="stone";
            String s2="longest";
            System.out.println(LCS(s1,s2));
    }
    public static int LCS(String s1, String s2){
            int[][] dp = new int[s1.length()][s2.length()];

            for(int[] row: dp){
                Arrays.fill(row,-1);
            }
            return solution1(s1, s2, s1.length()-1, s2.length()-1, dp);
    }
    public static int solution1(String s1, String s2, int idx1, int idx2, int[][] dp){
        if(idx1<0 || idx2<0){
            return 0;
        }
        if(dp[idx1][idx2]!=-1){
            return dp[idx1][idx2];
        }
        if(s1.charAt(idx1)==s2.charAt(idx2)){
            dp[idx1][idx2]=1+solution1(s1,s2,idx1-1,idx2-1,dp);
            return dp[idx1][idx2];
        }
        else{
            dp[idx1][idx2]=Math.max(solution1(s1,s2, idx1-1, idx2,dp), solution1(s1,s2,idx1, idx2-1,dp));
            return dp[idx1][idx2];
        }
    }
}


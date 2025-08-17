package DpOnString;

import java.util.Arrays;

public class longestCommonSubString {
    public static void main(String[] args) {
        String s1="dabcf";
        String s2="dfabc";
        System.out.println(lCS(s1,s2));
    }
    public static int lCS(String s1, String s2){
        int n=s1.length();
        int m=s2.length();
        int[][] dp = new int[m+1][n+1];
        for(int[] rows: dp){
            Arrays.fill(rows,-1);
        }
        for(int i=0;i<=n;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<=m;i++){
            dp[0][i]=0;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=0;
                }
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                max=Math.max(max,dp[i][j]);
            }
        }
        return max;
    }
}

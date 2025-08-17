package StringLoveBabbar;

import java.util.ArrayList;
import java.util.List;

public class wordBreak {
    private static Boolean[] dp;
    public static void main(String[] args) {
        List<String> wordDict = new ArrayList<>();
        wordDict.add("Leet");
        wordDict.add("Code");
        String s="LeetCode";
        System.out.println(wordProblem(s, wordDict));
    }
    public static boolean wordProblem(String s, List<String> wordDict){
        dp=  new Boolean[s.length()];
        return solve(s, 0, wordDict);
    }
    public static boolean solve(String s, int idx, List<String> wordDict ){
        if(idx==s.length()){
            return true;
        }
        if(dp[idx]!=null){
            return dp[idx];
        }
        for(int endIdx=idx+1;endIdx<=s.length();endIdx++){
            String split = s.substring(idx, endIdx);
            if(wordDict.contains(split) && solve(s,endIdx,wordDict)){
                return dp[idx]=true;
            }
        }
        return dp[idx]=false;
    }
}

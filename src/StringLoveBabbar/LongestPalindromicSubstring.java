package StringLoveBabbar;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String str ="";
        System.out.println(longestPalindromicSubstring(str));
    }
    public static String longestPalindromicSubstring(String s){
        int maxLen=Integer.MIN_VALUE;
        String res= "";
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            for (int j=i+1;j<s.length()+1;j++){
                if(isPalindrome(s.substring(i,j))){
                   if(s.substring(i,j).length()>maxLen){
                       res=s.substring(i,j);
                       maxLen=res.length();
                   }
                }
            }
        }
        return res;
    }
    public static boolean isPalindrome(String s){
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

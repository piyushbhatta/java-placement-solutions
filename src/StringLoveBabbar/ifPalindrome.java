package StringLoveBabbar;

public class ifPalindrome {
    public static void main(String[] args) {
        String s="abcdba";
        System.out.println(checkPalindrome(s));
    }
    public static boolean checkPalindrome(String s){
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

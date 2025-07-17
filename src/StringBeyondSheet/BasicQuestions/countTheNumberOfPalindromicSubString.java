package StringBeyondSheet.BasicQuestions;

public class countTheNumberOfPalindromicSubString {
    public static void main(String[] args) {
        String str="aaa";
        System.out.println(countSubString(str));
    }
    public static int countSubString(String S){
        int count=0;
        for(int i=0;i<S.length();i++){
            for(int j=i+1;j<=S.length();j++){
                if(checkForPalindrome(S.substring(i,j))){
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean checkForPalindrome(String substring) {
        int start=0;
        int end=substring.length()-1;
        while(start<=end){
            if(substring.charAt(start)!=substring.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}

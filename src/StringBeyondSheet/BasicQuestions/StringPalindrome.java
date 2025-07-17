package StringBeyondSheet.BasicQuestions;

public class StringPalindrome {
    public static void main(String[] args) {
        String S= "abbac";
        System.out.println(checkPalindrome(S));
    }
    public static boolean checkPalindrome(String S){
        StringBuilder Sb = new StringBuilder(S);
        int start=0;
        int end=S.length()-1;
        while(start<=end){
            char temp=Sb.charAt(start);
            Sb.setCharAt(start, Sb.charAt(end));
            Sb.setCharAt(end,temp);
            start++;
            end--;
        }
        return S.equals(Sb.toString());
    }
}

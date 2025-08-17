package String_I;

public class largestOddNumberInString {
    public static void main(String[] args) {
        String s="1234";
        System.out.println(findOdd(s));
    }
    public static String findOdd(String num){
        int n=num.length();
        for(int i=n-1;i>=0;i--){
            if((num.charAt(i)-'0')%2==1){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}

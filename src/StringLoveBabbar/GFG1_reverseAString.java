package StringLoveBabbar;

public class GFG1_reverseAString {
    public static void main(String[] args) {
        System.out.println(reverseString("Geeks"));
    }
    public static String reverseString(String s){
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        return rev;
    }
}

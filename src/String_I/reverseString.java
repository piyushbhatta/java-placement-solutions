package String_I;

public class reverseString {
    public static void main(String[] args) {
        String sb = "  Piyush";
        sb=sb.trim();
        System.out.println(rev(sb));
    }
    public static String rev(String str){
        StringBuilder sb = new StringBuilder(str);
        int start=0;
        int end=str.length()-1;
        while(start<end){

            char temp = sb.charAt(start);
            sb.setCharAt(start,sb.charAt(end));
            sb.setCharAt(end,temp);
            start++;
            end--;
        }
        return sb.toString();
    }
}

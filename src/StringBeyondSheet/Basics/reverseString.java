package StringBeyondSheet.Basics;

public class reverseString {
    public static void main(String[] args) {
        String S= "Geeks";
        System.out.println(reverseUsingStringBuilder(S));
    }

    public static String reverseUsingString(String S){
        String rev = "";
        for(int i=S.length()-1;i>=0;i++){
            rev+=S.charAt(i);
        }
        return rev;
    }

    public static String reverseUsingStringBuilder(String S){
        StringBuilder Sb = new StringBuilder(S);
        int start=0;
        int end=S.length()-1;
        while(start<=end){
            char temp=Sb.charAt(start);
            Sb.setCharAt(start,Sb.charAt(end));
            Sb.setCharAt(end,temp);
            start++;
            end--;
        }
        return Sb.toString();
    }
}

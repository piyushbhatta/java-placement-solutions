package StringBeyondSheet.BasicQuestions;

public class reverseString {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Geeks");
        reverseStringBuilder(str);
        System.out.println(str);
    }
    public static String reverseStringS(String S){
        String rev = "";
        for(int i=S.length()-1;i>=0;i++){
            rev+=S.charAt(i);
        }
        return rev;
    }
    public static void reverseStringBuilder(StringBuilder S){
        StringBuilder sb = new StringBuilder(S);
        int start=0;
        int end=S.length()-1;
        while(start<=end){
            char temp=sb.charAt(start);
            sb.setCharAt(start,sb.charAt(end));
            sb.setCharAt(end,temp);
            start++;
            end--;
        }
    }
}

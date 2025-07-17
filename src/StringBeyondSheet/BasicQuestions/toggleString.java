package StringBeyondSheet.BasicQuestions;

public class toggleString {
    public static void main(String[] args) {
        String str="PhYsIcs";
        System.out.println(toggle(str));
    }
    public static String toggle(String S){
        StringBuilder Sb = new StringBuilder(S);
        for(int i=0;i<S.length();i++){
            int ascii=(int)Sb.charAt(i);
            if(ascii>=97){
                Sb.setCharAt(i,(char)(Sb.charAt(i)-32));
            } else if (ascii<=90) {
                Sb.setCharAt(i,(char)(Sb.charAt(i)+32));
            }
        }
        return Sb.toString();
    }
}

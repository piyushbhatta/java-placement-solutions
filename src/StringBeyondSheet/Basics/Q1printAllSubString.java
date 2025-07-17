package StringBeyondSheet.Basics;

public class Q1printAllSubString {
    public static void main(String[] args) {
        String str = "Parkhi";
        allSubString(str);
    }
    public static void allSubString(String s){

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
}

package StringBeyondSheet.Basics;

public class checkingForParameterPass {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        int n=2;
        System.out.println(sb);
        deleteAtIdx(sb, n);
        // Same as array we can change the Original StringBuilder Using any
        // reference Variable
        System.out.println(sb);
    }
    public static void deleteAtIdx(StringBuilder sb, int n){
        sb.deleteCharAt(n);
    }
}

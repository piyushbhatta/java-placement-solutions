package MathForDSA;

public class Q2convertDecimalToBinary {
    public static void main(String[] args) {
        System.out.println(D2B(15));
    }
    public static String D2B(int n){
        String str ="";
        while(n!=1){
            if(n%2==1){
                str+="1";
            }else{
                str+="0";
            }
            n=n/2;
        }
        return "1".concat(reverse(str));
    }

    private static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}

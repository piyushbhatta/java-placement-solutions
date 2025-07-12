package MathForDSA;

public class Q1convertBinaryToDecimal {
    public static void main(String[] args) {
        System.out.println(B2D("1100"));
    }
    public static int B2D(String str){
        int n=str.length();
        int p2=1;
        int ans=0;
        for(int i=n-1; i>=0;i--){
            if(str.charAt(i)=='1'){
                ans=ans+p2;
            }
            p2=2*p2;
        }
        return ans;
    }
}

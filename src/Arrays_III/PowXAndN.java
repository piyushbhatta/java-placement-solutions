package Arrays_III;

public class PowXAndN {
    public static void main(String[] args) {
        System.out.println(POW(2.0000,-2));
    }
    // Naive Approach
    public static double pow(float x, int n){
        double product = 1;
        if(n>0){
            for (int i = 1; i <= n; i++) {
                product = product * x;
            }
        }
        else if(n==0){
            return 1;
        }
        else{
            int k=-n;
            for (int i = 1; i <= k; i++) {
                product = product / x;
            }
        }
        return product;
    }

    //Optimal Approach
    public static double POW(double x, int n){
        double ans=1;
        long binForm=n;
        if(binForm<0){
            x=1/x;
            binForm=-binForm;
        }
        while(binForm>0){
            if(binForm%2==1){
                ans=ans*x;
            }
            x=x*x;
            binForm/=2;
        }
        return ans;
    }
}

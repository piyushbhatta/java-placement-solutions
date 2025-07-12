package MathForDSA_II;

import java.util.ArrayList;
import java.util.List;

public class Q4PrimeFactorisationUsingSeive {
    public static int[] spf;
    public static void main(String[] args) {
        sieve();
        System.out.println(findPrimeFactors(60));
    }

    public static void sieve() {
        int n=200000;
        spf= new int[n+1];
        for(int i=1;i<spf.length;i++){
            spf[i]=i;
        }
        for(int i=2;i*i<spf.length;i++){
            if(spf[i]==i){
                for(int j=i*i; j<n;j+=i){
                    if(spf[j]==j){
                        spf[j]=i;
                    }
                }
            }
        }
    }

    public static List<Integer> findPrimeFactors(int N) {
        List<Integer> factors = new ArrayList<>();
        while (N != 1) {
            factors.add(spf[N]);
            N /= spf[N];
        }
        return factors;
    }
}

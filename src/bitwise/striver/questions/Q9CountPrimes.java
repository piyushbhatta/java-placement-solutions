package bitwise.striver.questions;

import java.util.Arrays;

/// Sieve of Eratosthenes
public class Q9CountPrimes {
    public static void main(String[] args) {
        System.out.println(countPrimes(100));
    }
    public static int countPrimes(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        for(int i=2;i*i<n;i++){
            if(isPrime[i]){
                for(int j=i*i;j<n;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(isPrime[i]){
                count++;
            }
        }
        return count;
    }
}

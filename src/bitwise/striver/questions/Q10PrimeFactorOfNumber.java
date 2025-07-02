package bitwise.striver.questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Q10PrimeFactorOfNumber {
    public static void main(String[] args) {
        System.out.println(primeFactor(24));
    }
    public static ArrayList<Integer> primeFactor(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                ans.add(i);
            }while(n%i==0){
                n/=i;
            }
        }
        if(n!=1){
            ans.add(n);
        }
        return ans;
    }
}

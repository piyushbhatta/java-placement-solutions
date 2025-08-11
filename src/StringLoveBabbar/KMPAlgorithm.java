package StringLoveBabbar;

import java.util.ArrayList;

public class KMPAlgorithm {
    public static void main(String[] args) {
        String  txt = "abcab";
        String pat = "ab";
        System.out.println(search(pat,txt));
    }
    public static ArrayList<Integer> search(String pat, String txt) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] lps = computeLPSA(pat);
        int n=txt.length();
        int i=0;
        int j=0;
        while(i<n){
            if(pat.charAt(j) == txt.charAt(i)){
                i++;
                j++;
            }
            if(j==pat.length()){
                list.add(i-j);
                j = lps[j - 1];
            }

            else if(i<n && pat.charAt(j)!=txt.charAt(i)){
                if(j!=0){
                    j=lps[j-1];
                }else{
                    i=i+1;
                }
            }
        }
        return list;
    }

    private static int[] computeLPSA(String pat) {
        int[] lps = new int[pat.length()];
        lps[0]=0;
        int length=0;
        for(int i=1;i<pat.length();i++){
            if(pat.charAt(i)==pat.charAt(length)){
                length++;
                lps[i]=length;
                i++;
            }
            else{
                if(length!=0){
                    length=lps[length-1];
                }else {
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps;
    }
}

package StringLoveBabbar;

import java.util.ArrayList;
import java.util.Arrays;

public class duplicatesCharactersInString {
    public static void main(String[] args) {
        String txt = "abababcababc";
        String pat = "ababc";
        System.out.println(Arrays.toString(computeLPS(pat)));
        System.out.println(KMP(txt,pat));
    }
    public static ArrayList<Integer> KMP(String txt, String pat){
        ArrayList<Integer> list= new ArrayList<>();
        int[] lps=computeLPS(pat);
        int j=0;
        int i=0;
        while(i<txt.length())
        {
            if(txt.charAt(i)==pat.charAt(j)){
                i++;
                j++;
            }
            if(j==pat.length()){
                list.add(i-j);
                j=lps[j-1];
            }
            else if(i<txt.length() && pat.charAt(j)!=txt.charAt(i)){
                if(j!=0){
                    j=lps[j-1];
                }else{
                    i++;
                }
            }
        }
        return list;
    }

    private static int[] computeLPS(String pat) {
        int[] lps = new int[pat.length()];
        lps[0]=0;
        int len=0;
        int i=1;
        while(i<pat.length()){
            if(pat.charAt(i)==pat.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                if(len!=0){
                    len=lps[len-1];
                }else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps;
    }
}

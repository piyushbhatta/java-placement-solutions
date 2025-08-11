package StringLoveBabbar;

public class StringsRotationsOfEachOther {
    public static void main(String[] args) {
        String s1 = "abcd", s2 = "cdab";
        System.out.println(areRotation(s1,s2));
    }
    public static boolean areRotation(String s1, String s2){
        String txt = s1+s1;
        String pat=s2;
        int[] lps= computeLPS(pat);
        int n=txt.length();
        int m=pat.length();
        int i=0, j=0;
        while(i<n){
            if(txt.charAt(i)==pat.charAt(j)){
                i++;
                j++;
            }
            if(j==m){
                return true;
            }
            else if(i<n && txt.charAt(i)!=pat.charAt(j)){
                if(j!=0){
                    j=lps[j-1];
                }else{
                    i++;
                }
            }
        }
        return false;
    }
    public static int[] computeLPS(String s){
        int n=s.length();
        int[] lps = new int[n];
        lps[0]=0;
        int length=0;
        int i=1;
        while (i<n){
            if(s.charAt(i)==s.charAt(length)){
                length++;
                lps[i]=length;
                i++;
            }else{
                if(length!=0){
                    length=lps[length-1];
                }else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps;
    }
    public static boolean areRotations(String s1, String s2){
        s1+=s1;
        return s1.contains(s2);
    }
}

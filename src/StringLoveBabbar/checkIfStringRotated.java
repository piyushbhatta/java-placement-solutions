package StringLoveBabbar;

public class checkIfStringRotated {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "bcda";

    }
    public static boolean checkUsingKMP(String s1, String s2){
        String txt = s1.concat(s1);
        String pat = s2;
        int[] lps= compute(s2);
        int j=0;
        int i=0;
        boolean flag=false;
        while(i<txt.length()){
            if(txt.charAt(i)==txt.charAt(j)){
                i++;
                j++;
            }
            if(j==pat.length()){
                return true;
            } else if (i<txt.length() && txt.charAt(i)!=pat.charAt(j)) {

            }
        }

        return flag;
    }

    private static int[] compute(String s2) {
        int[] lps = new int[s2.length()];
        int len=0;
        lps[0]=0;
        int i=1;
        while(i<lps.length){
            if(s2.charAt(i)==s2.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
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

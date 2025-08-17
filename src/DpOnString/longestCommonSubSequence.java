package DpOnString;

public class longestCommonSubSequence {
    public static void main(String[] args) {
        String s1= "acd";
        String s2= "ced";
        int[][] dp = new int[s1.length()][s2.length()];
        System.out.println(lengthCommonSubSeq(s1,s2));
    }
    public static int lengthCommonSubSeq(String s1, String s2){
        int lastIdx1=s1.length()-1;
        int lastIdx2=s2.length()-1;
        return solution(s1, s2, lastIdx1, lastIdx2);
    }

    private static int solution(String s1, String s2, int Idx1, int Idx2) {
        if(Idx1<0 || Idx2<0){
            return 0;
        }
        if(s1.charAt(Idx1)==s2.charAt(Idx2)){
            return 1+solution(s1,s2,Idx1-1,Idx2-1);
        }
        else{
            return Math.max(solution(s1, s2, Idx1-1,Idx2), solution(s1, s2, Idx1, Idx2-1));
        }
    }
}

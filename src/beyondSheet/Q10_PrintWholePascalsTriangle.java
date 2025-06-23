package beyondSheet;

import java.util.ArrayList;

public class Q10_PrintWholePascalsTriangle {
    public static void main(String[] args) {
        System.out.println(PascalsTriangle(6));
    }
    public static ArrayList<ArrayList<Integer>> PascalsTriangle(int N){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=1; i<=N;i++){
            list.add(nRowPascal(i));
        }
        return list;
    }
    public static ArrayList<Integer> nRowPascal(int N){
        ArrayList<Integer> list = new ArrayList<>();
        int ans=1;
        list.add(ans);
        for(int i=1;i<N;i++){
            ans=ans*(N-i);
            ans=ans/i;
            list.add(ans);
        }
        return list;
    }
}

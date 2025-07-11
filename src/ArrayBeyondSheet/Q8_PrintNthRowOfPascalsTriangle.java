package ArrayBeyondSheet;

import java.util.ArrayList;

public class Q8_PrintNthRowOfPascalsTriangle {
    public static void main(String[] args) {
        System.out.println(nRowOfPascals(6));
    }
    public static ArrayList<Integer> nRowOfPascals(int n){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int ans = 1;
        for(int i=1;i<n;i++){
            ans=ans*(n-i);
            ans=ans/i;
            list.add(ans);
        }
        return list;
    }
}

package Arrays_I;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        printRow(6);
        System.out.println();
        System.out.println(findEleAt(6,3));;
        System.out.println(pascalTriangle(6));
    }


    // Print particular element of the by row and Column detail
    public static int findEleAt(int r, int c){
        return nCr(r-1,c-1);
    }
    public static int nCr(int n, int r){
        int res=1;
        for(int i=0;i<r;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return res;
    }


    //Print the random row of the Pascal's Triangle
    public static void printRow(int n){
        int ans=1;
        System.out.print(ans+" ");
        for(int i=1;i<n;i++){
            ans=ans*(n-i);
            ans=ans/i;
            System.out.print(ans+" ");
        }
    }

    // Generate Pascal's Triangle

    public static List<List<Integer>> pascalTriangle(int numRows){
        List<List<Integer>> ans= new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ans.add(generationRow(i));
        }
        return ans;
    }
    public static List<Integer> generationRow(int row){
        int ans =1;
        List<Integer> ansRow= new ArrayList<>();
        ansRow.add(ans);
        for(int col=1;col<row;col++){
            ans=ans*(row-col);
            ans=ans/(col);
            ansRow.add(ans);
        }
        return ansRow;
    }
}

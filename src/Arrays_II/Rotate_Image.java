package Arrays_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Rotate_Image {
    public static void main(String[] args) {
        int[][] mat={{5,1,9,11},
                    {2,4,8,10},
                    {13,3,6,7},
                    {15,14,12,16}};
        Arrays.sort(mat);
        System.out.println(Arrays.deepToString(mat));
        Optimal_solution(mat);
        System.out.println(Arrays.deepToString(mat));
    }
    public static int[][] rotate(int[][] mat){
        int n= mat.length;
        int[][] ans = new int[n][n];
        int r_start=0;
        int c_end= n-1;
        for(int i=0; i< n;i++){
            for(int j=0;j< n; j++){
                ans[j][c_end]=mat[r_start][j];
            }
            r_start++;
            c_end--;
        }
        return ans;
    }
    public static void Optimal_solution(int[][] matrix){
        int n=matrix.length;
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
        // Transpose and reverse
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for (int[] ints : matrix) {
            reverse(ints);
        }
    }

    private static void reverse(int[] matrix) {
        int start=0;
        int end= matrix.length-1;
        while(start<end){
            int temp=matrix[start];
            matrix[start]=matrix[end];
            matrix[end]=temp;
            start++;
            end--;
        }
    }
}

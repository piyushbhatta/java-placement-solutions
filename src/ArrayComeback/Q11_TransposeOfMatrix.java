package ArrayComeback;

import java.util.Arrays;

public class Q11_TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        transpose(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
    public static void transpose(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(j>i){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;;
                }
            }
        }
    }

}

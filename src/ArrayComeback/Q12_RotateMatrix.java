package ArrayComeback;

import java.util.Arrays;

public class Q12_RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
    public static void rotate(int[][] matrix){
        Transpose(matrix);
        int n=matrix.length;
        for(int i=0;i<n;i++){
            reverse(matrix[i]);
        }
    }
    public static void Transpose(int[][] matrix){
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(j>i){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }
    }
    public static void reverse(int[] row){
        int start=0;
        int end=row.length-1;
        while(start<=end){
            swap(row,start,end);
            start++;
            end--;
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

package ArrayBeyondSheet;

import java.util.Arrays;

public class Q6_SetMatrixZero {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] arr1 = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        OptimalSol(arr1);
        System.out.println(Arrays.deepToString(arr1));
    }
    public static void setZero(int[][] mat){
        int n= mat.length;
        int m= mat[0].length;
        int[] row = new int[mat.length];
        int[] col = new int[mat[0].length];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(row[i]==1){
                for(int k=0;k<m;k++){
                    mat[i][k]=0;
                }
            }
        }
        for(int j=0;j<m;j++){
            if (col[j]==1){
                for(int k=0;k<n;k++){
                    mat[k][j]=0;
                }
            }
        }
    }
    public static void OptimalSol(int[][] mat){
        int n= mat.length;
        int m= mat[0].length;
        int col0=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    mat[i][0]=0;
                    if(j!=0){
                        mat[0][j]=0;
                    }else{
                        col0=0;
                    }
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(mat[i][j]!=0){
                    if(mat[i][0]==0 || mat[0][j]==0){
                        mat[i][j]=0;
                    }
                }
            }
        }
        if(mat[0][0]==0){
            for(int i=0;i<n;i++){
                mat[i][0]=0;
            }
        }
        if(col0==0){
            for(int j=0;j<n;j++){
                mat[0][j]=0;
            }
        }
    }
}

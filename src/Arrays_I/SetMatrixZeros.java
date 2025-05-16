package Arrays_I;

import java.util.Arrays;

public class SetMatrixZeros {
    public static void main(String[] args){
        int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] arr1 = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        BetterSoln(arr1);
        System.out.println(Arrays.deepToString(arr1));
    }
    public static void BruteSoln(int[][] mat){
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==0){
                    int k=j;
                    while(k>-1){
                        k--;
                        if(k>-1 && mat[i][k]!=0){
                            mat[i][k]=-1;
                        }
                    }
                    k=j;
                    while(k<mat[i].length){
                        k++;
                        if(k<mat[i].length && mat[i][k]!=0){
                            mat[i][k]=-1;
                        }
                    }
                    k=i;
                    while(k>-1){
                        k--;
                        if(k>-1 && mat[i][k]!=0){
                            mat[k][j]=-1;
                        }
                    }
                    k=i;
                    while(k<n){
                        k++;
                        if(k<n && mat[i][k]!=0){
                            mat[k][j]=-1;
                        }
                    }
                }
            }
        }
        for (int i=0;i<mat.length;i++){
            for (int j=0; j<mat[i].length;j++){
                if(mat[i][j]==-1){
                    mat[i][j]=0;
                }
            }
        }
    }
    public static void BetterSoln(int[][] matrix){
        int[] col= new int[matrix[0].length];
        int[] row= new int[matrix.length];
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(col[j]==1){
                    int k=0;
                    while(k< matrix.length){
                        matrix[k][j]=0;
                        k++;
                    }
                }

                if(row[i]==1){
                    int k=0;
                    while(k< matrix.length){
                        matrix[i][k]=0;
                        k++;
                    }
                }
            }
        }
    }
    public static void OptimalSoln(int[][] matrix){
        int col0=1;
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    if(j!=0){
                        matrix[0][j]=0;
                    }else{
                        col0=0;
                    }
                }
            }
        }
        for(int i=1;i< matrix.length;i++){
            for(int j=1;j< matrix[i].length;j++){
                if(matrix[i][j]!=0){
                    if(matrix[i][0]==0 || matrix[0][j]==0){
                        matrix[i][j]=0;
                    }
                }
            }
        }
        if(matrix[0][0]==0){
            for (int j=0;j< matrix[0].length;j++){
                matrix[0][j]=0;
            }
        }
        if(col0==0){
            for (int i=0;i< matrix.length;i++){
                matrix[i][0]=0;
            }
        }
    }
}

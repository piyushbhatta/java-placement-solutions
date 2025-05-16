package Arrays_III;

public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] mat={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(BinarySearch_II(mat,20));
    }
    public static boolean bSearch(int[][] matrix, int target){
        int i=0;
        while(i<matrix.length){
            if(BinaryS(matrix[i], target)){
                return true;
            }else{
                i++;
            }
        }
        return false;
    }

    private static boolean BinaryS(int[] row, int target) {
        int low=0;
        int high= row.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(row[mid]==target){
                return true;
            } else if (target>row[mid]) {
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return false;
    }
    public static boolean BinarySearch_II(int[][] matrix, int target){
        int n=matrix.length;
        int m=matrix[0].length;
        int low = 0;
        int high = n*m-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            int row=mid/m;
            int col=mid%m;
            if(matrix[row][col]==target){
                return true;
            } else if (matrix[row][col]<target) {
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return false;
    }
}

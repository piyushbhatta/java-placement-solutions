package Arrays_III;

public class GridUniquePath {
    public static void main(String[] args) {
        System.out.println(uniquePath(3,7));
    }
    public static int uniquePath(int m, int n){
        int N=n+m-2;
        int r=m-1;
        double res=1;

        for(int i=1;i<=r;i++){
            res=res*(N-r+i)/i;
        }
        return (int)res;
    }
}

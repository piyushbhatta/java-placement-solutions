package HelloWorld;

public class PrintPrimeNumbers {
    public static void main(String[] args) {
        printPrime(100);
    }
    public static void printPrime(int n){
        System.out.print(2+" ");
        for(int i=3;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            };
        }
    }

    private static boolean isPrime(int n) {
        if(n==2) return true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}

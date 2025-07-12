package MathForDSA;

public class Q12countNumberOfSetBit {
    public static void main(String[] args) {
        int n = ~(10&7);
        System.out.println(n);
        System.out.println(count2(15));
    }
    public static int count(int n){
        int count=0;
        while(n!=1){
            if(n%2==1){
                count++;
            }
            n/=2;
        }
        return count+1;
    }
    public static int count1(int n){
        int count=0;
        while(n>1){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        return count+1;
    }
    public static int count2(int n){
        int count=0;
        while(n!=0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
}

package ArrayBeyondSheet;

import java.util.ArrayList;

public class Q17_RepeatAndMissedElement {
    public static void main(String[] args) {
        int[] nums = {4, 3, 6, 2, 1, 1};
        System.out.println((DupeAndMiss_Math(nums)));
    }
    public static ArrayList<Integer> DupeAndMiss_Math(int[] arr){
        long n=arr.length;
        long S=0;
        long S2=0;
        long Sn=(n*(n+1))/2;
        long S2n=(n*(n+1)*(2*n+1))/6;
        for(int i=0;i<n;i++){
            S=S+(long)arr[i];
            S2=S2+((long)arr[i]*(long)arr[i]);
        }
        long val1=S-Sn; //X-Y
        long val2=S2-S2n; //X2-Y2
        val2=val2/val1;//X+y
        long X, Y;
        X=(val1+val2)/2;
        Y=val2-X;
        ArrayList<Integer> list = new ArrayList<>();
        list.add((int)X);
        list.add((int)Y);
        return list;
    }
}

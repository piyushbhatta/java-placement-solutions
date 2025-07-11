package ArrayBeyondSheet.beyondsheetPlatform;

import java.util.ArrayList;
import java.util.Collections;

public class GFG1_ArrayLeaders {
    public static void main(String[] args) {
        int[] arr={16, 17, 4, 3, 5, 2};
        System.out.println(leaders(arr));
    }
    public static ArrayList<Integer> leaders(int[] arr){
        int n=arr.length-1;
        int maxSoFar=n;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[maxSoFar]);
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=arr[maxSoFar]){
                maxSoFar=i;
                list.add(arr[maxSoFar]);
            }
        }
        Collections.sort(list, Collections.reverseOrder());
        return list;
    }
}

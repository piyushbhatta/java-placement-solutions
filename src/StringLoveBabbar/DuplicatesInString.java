package StringLoveBabbar;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesInString {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        printDuplicates(str);
        System.out.println();
    }
    public static void printDuplicates(String s){
        HashMap<Character, Integer> freq = new HashMap<>();
        for(int i=0; i<s.length();i++){
            freq.put(s.charAt(i),freq.getOrDefault(s.charAt(i),0)+1);
        }

        for (Map.Entry<Character, Integer> it : freq.entrySet()) {
            if (it.getValue() > 1) {
                System.out.print("['" + it.getKey() + "', " + it.getValue() + "], ");
            }
        }
    }
}

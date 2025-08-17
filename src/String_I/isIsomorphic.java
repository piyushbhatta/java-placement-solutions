package String_I;

import java.util.HashMap;
import java.util.logging.Handler;

public class isIsomorphic {
    public static void main(String[] args) {
        String s = "egg", t = "aff";
        System.out.println(checkIsomorphic(s,t));
    }
    public static boolean checkIsomorphic(String s1, String s2){
        HashMap<Character, Character> map = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char c1=s1.charAt(i);
            char c2=s2.charAt(i);
            if(map.containsKey(c1)){
                if(map.get(c1)!=c2){
                    return false;
                }
            }
            else if(map.containsValue(c2)){
                return false;
            }
            map.put(s1.charAt(i),s2.charAt(i));
        }
        return true;
    }
}

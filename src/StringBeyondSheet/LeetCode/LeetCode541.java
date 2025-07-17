package StringBeyondSheet.LeetCode;

public class LeetCode541 {
    public static void main(String[] args) {
        String str = "abcdefgh";
        System.out.println(reverseStr(str,2));
    }
    public static String reverseStr(String s, int k){
        char[] arr=s.toCharArray();
        for(int i=0;i<s.length();i+=2*k){
            int start=i;
            int end=Math.min(start+k-1,s.length()-1);
            while(start<end){
                char ch = arr[start];
                arr[start]=arr[end];
                arr[end]=ch;
                start++;
                end--;
            }
        }
        return new String(arr);
    }
}

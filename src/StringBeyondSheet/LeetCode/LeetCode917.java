package StringBeyondSheet.LeetCode;

public class LeetCode917 {
    public static void main(String[] args) {
        String s = "ab-cd";
        System.out.println(reverseOnlyLetters(s));
    }
    public static String reverseOnlyLetters(String s){
        char[] arr = s.toCharArray();
        int start=0;
        int end=s.length()-1;
        while(start<=end) {
            int asciiS = s.charAt(start);
            if (asciiS < 65 || asciiS > 122 || (asciiS > 90 && asciiS < 97)) {
                start++;
                continue;
            }
            int asciiE = s.charAt(end);
            if (asciiE < 65 || asciiE > 122 || (asciiE > 90 && asciiE < 97)) {
                start++;
                continue;
            }
            char ch = s.charAt(start);
            arr[start] = arr[end];
            arr[end] = ch;
            start++;
            end--;
        }
        return new String(arr);
    }
}

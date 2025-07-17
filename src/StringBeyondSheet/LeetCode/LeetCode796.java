package StringBeyondSheet.LeetCode;

public class LeetCode796 {
    public static void main(String[] args) {

    }
    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;

        String doubled = s + s;
        return doubled.contains(goal);
    }
}

package StringBeyondSheet.LeetCode;

public class LeetCode443 {
    public static void main(String[] args) {
        char[] chars={'a','a','b','b','c','c','c'};
        char[] chars1={'a'};
        System.out.println(compress(chars1));
    }
    public static int compress(char[] chars) {
        StringBuilder sb = new StringBuilder("");
        char ch=chars[0];
        int count=1;
        sb.append(ch);
        for(int i=1;i<chars.length;i++){
            if(chars[i]==ch){
                count++;
            }else{
                if(count>1) sb.append(count);
                ch=chars[i];
                sb.append(ch);
                count=1;
            }
        }
        if(count>1) sb.append(count);
        int idx=Math.min(chars.length, sb.length());
        for(int i=0;i<idx;i++){
            chars[i]=sb.charAt(i);
        }
        return idx;
    }
}

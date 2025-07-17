package StringBeyondSheet.Basics;
import java.util.*;
public class HelloString {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str);
//        Scanner sc = new Scanner(System.in);
//        String str1= sc.next();
//        System.out.println(str1);
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
//            System.out.print(ch+" ");
        }
//        System.out.println();


        int idx=str.indexOf('z');
//        System.out.println(idx);


        int lastIdx = str.lastIndexOf('l');
//        System.out.println(lastIdx);

        char lastChar=str.charAt(str.length()-1);
//        System.out.println(lastChar);

        String str1 = "Mello";
        String str2 = "Hello";
        String str3 = "Fello";
        System.out.println(str.compareTo(str1));
        System.out.println(str.compareTo(str2));
        System.out.println(str.compareTo(str3));

        System.out.println(str.equals(str1));
    }
}

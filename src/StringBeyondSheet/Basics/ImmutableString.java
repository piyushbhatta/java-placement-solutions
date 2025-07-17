package StringBeyondSheet.Basics;

public class ImmutableString {
    public static void main(String[] args) {
        int x=5;

        String str ="Piyush";
        System.out.println(str);
         String s = "hello";

        str.concat(" Bhatta");
        System.out.println(str);

        System.out.println(str.concat(" Bhatta"));


        String str1=str.concat(" Bhatta");
        // Now first a new object will be formed and
        // the new reference Variable(str1) will be pointing to the new Object
        System.out.println(str1);

        str=str.concat(" Bhatta");
        // Now first a new object will be formed and
        // the same reference Variable(str) will be pointing to the newly formed Object
        System.out.println(str);
    }
}

package StringBeyondSheet.Basics;

public class StringInBuilt {
    public static void main(String[] args) {
        String str="Hello";
        str.toLowerCase();
        // String is Immutable toh jab hum original String Ko change karne ka try karte hai
        // wo change nhi hoga isiliye str jo pahle tha wahi print hoga
        System.out.println(str);

        System.out.println(str.toLowerCase());// Yahaan Pahle wo ek naya object bana rhe hain usko print kara rahe hain
        System.out.println(str.toUpperCase());

        System.out.println(str.substring(1,5));
        System.out.println(str.substring(3));

        String s1="Piyush";
        String s2="Piyush";
        String s3 = new String("Piyush");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
    }
}

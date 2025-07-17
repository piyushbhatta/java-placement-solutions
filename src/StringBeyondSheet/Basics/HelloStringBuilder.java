package StringBeyondSheet.Basics;

public class HelloStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        System.out.println(sb);
        char ch = sb.charAt(3);
        System.out.println("Char At index 3 is: "+ch);

        sb.append(" World");
        sb.append(" "+true);
        sb.append(" "+10);
        System.out.println(sb);


        sb.setCharAt(2,'o');
        System.out.println("we can set any Index of String Builder"+sb);

        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);

        sb.insert(6,"OF ");
        System.out.println(sb);
    }
}

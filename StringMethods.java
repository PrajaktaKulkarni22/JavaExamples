import java.util.Locale;
import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter any string:");
        String str=sc.next();

        System.out.println("Character at particular index:"+str.charAt(3));
        System.out.println("Length of string:"+str.length());
        System.out.println("Uppercase string:"+str.toUpperCase());
        System.out.println("Lowercase string:"+str.toLowerCase());
        System.out.println("Concatenation of string:"+str.concat("abc"));
        System.out.println("Compare to:"+str.compareTo("XYZ"));
        System.out.println("Compare to ignore case:"+str.compareToIgnoreCase("xyz"));
        System.out.println("Contains:"+str.contains("p"));
        System.out.println("Code point at:"+str.codePointAt(5));
        System.out.println("Equals:"+str.equals("prajakta"));
        System.out.println("Ends with:"+str.endsWith("a"));
        System.out.println("Index of:"+str.indexOf("j"));
        System.out.println("Last index of:"+str.lastIndexOf("a"));
        System.out.println("Is empty:"+str.isEmpty());
        System.out.println("Substring:"+str.substring(3));
        System.out.println("Replace:"+str.replace("p","t"));
        System.out.println("Substring with start and end:"+str.substring(3,5));

    }
}

import java.util.Scanner;

public class AlphabetCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any character:");
        char ch=sc.next().charAt(0);
        if ((ch>='a' && ch<='z' ) || (ch>='A' && ch<='Z'))
            System.out.println("Entered character"+ch+ " is an alphabet");
        else
            System.out.println("Entered character"+ch+" is not an alphabet");
    }
}

import java.util.Scanner;

public class ThrowDemo {
    public void checkAge(int age){
        if (age<18){
            throw new ArithmeticException("Access denied you cannot vote");
        }
        else {
            System.out.println("You are eligible for voting");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age:");
        int age=sc.nextInt();

        ThrowDemo td=new ThrowDemo();
        td.checkAge(age);
    }
}

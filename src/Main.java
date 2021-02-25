import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();

        System.out.println("Welcome, " + name + " " + lastName);
    }
}

import java.util.Scanner;

public class Register {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------ New User Registration -----------");

        System.out.print("Input username: ");
        String username = sc.nextLine();

        System.out.print("Input password: ");
        String password = sc.nextLine();

        System.out.print("Confirm password: ");
        String confirm = sc.nextLine();

        if (password.equals(confirm)) {
            System.out.println("Registration successful!");
        } else {
            System.out.println("Passwords do not match!");
        }

        sc.close();
    }
}
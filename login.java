import java.util.Scanner;

public class login {

    public static void loginUser() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n------ LOGIN SCREEN ------");

        System.out.print("Username: ");
        String user = sc.nextLine();

        System.out.print("Password: ");
        String pass = sc.nextLine();

        System.out.println("Login successful!");
        System.out.println("Welcome " + user);
        System.out.println("Your password is: " + pass); 

        sc.close(); 
    }

    public static void main(String[] args) {
        loginUser();
    }
}
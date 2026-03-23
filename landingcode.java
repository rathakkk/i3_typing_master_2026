package i3_typing_master_2026;


import java.util.Scanner;

public class landingcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("------------ Welcome to I3 Typing Master v2026 -----------");
            System.out.println("To begin, please select one of the following options:");
            System.out.println("  1. Login");
            System.out.println("  2. Register");
            System.out.println("  3. Exit");
            System.out.print("Choose an option: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Login page (coming soon)");
                    break;
                case 2:
                    System.out.println("Register page (coming soon)");
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

            System.out.println(); // spacing

        } while (choice != 3);

        sc.close();
    }
}
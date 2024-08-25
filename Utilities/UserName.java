package Utilities;
import java.util.Scanner;

public class UserName {

    public static void userName() {
        Scanner sc = new Scanner(System.in);

        // Prompt for user name
        System.out.print("\nlet's begin the application with\nYour Name Please: ");
        String userNamePrompt = sc.nextLine();

        // Greeting with decorative elements
        System.out.println("\nHello " + userNamePrompt + "!");
        System.out.println("Thank you for using our application.");
        System.out.println("We hope you have a great experience!");
        System.out.println("\n          >>>>>>> let's Begin <<<<<<<");
    }
}

package BasicCalculations;

import java.util.Scanner;

public class Subtraction {
    public void execute() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- Subtraction Operation ---");

        System.out.print("Please enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Please enter the second number: ");
        int num2 = sc.nextInt();

        int result = subtract(num1, num2);

        System.out.println("\n--- Result ---");
        System.out.println("The subtraction of " + num1 + " and " + num2 + " is: " + result);
        System.out.println("------------------");
    }
    public int subtract(int a, int b) {
        return a - b;
    }

}
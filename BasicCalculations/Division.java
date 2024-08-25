package BasicCalculations;

import java.util.Scanner;

public class Division {
    public void execute() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- Division Operation ---");

        System.out.print("Please enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Please enter the second number: ");
        int num2 = sc.nextInt();

        double result = divide(num1, num2);

        System.out.println("\n--- Result ---");
        System.out.println("The division of " + num1 + " and " + num2 + " is: " + result);
        System.out.println("------------------");
    }
    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return (double) a / b;
    }
}
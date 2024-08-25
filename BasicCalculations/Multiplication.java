package BasicCalculations;

import java.util.Scanner;

public class Multiplication {
    public void execute() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- Multiplication Operation ---");

        System.out.print("Please enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Please enter the second number: ");
        int num2 = sc.nextInt();

        int result = multiply(num1, num2);

        System.out.println("\n--- Result ---");
        System.out.println("The multiplication of " + num1 + " and " + num2 + " is: " + result);
        System.out.println("------------------");
    }
    public int multiply(int a, int b) {
        return a * b;
    }

}
package BasicCalculations;

import java.util.Scanner;

public class Sum {
    public void execute() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- Addition Operation ---");

        System.out.print("Please enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Please enter the second number: ");
        int num2 = sc.nextInt();

        int result = add(num1, num2);

        System.out.println("\n--- Result ---");
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
        System.out.println("------------------");
    }
    public int add(int a, int b) {
        return a + b;
    }
}
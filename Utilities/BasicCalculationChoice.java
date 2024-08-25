package Utilities;

import BasicCalculations.Division;
import BasicCalculations.Multiplication;
import BasicCalculations.Subtraction;
import BasicCalculations.Sum;
import Junction.Junction;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicCalculationChoice {

    public void chooser() {
        Sum sumObj = new Sum();
        Multiplication multiplicationObj = new Multiplication();
        Division divisionObj = new Division();
        Subtraction subtractionObj = new Subtraction();

        Junction junctionObj = new Junction();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n          <------ Basic Calculations Menu ------>");
            System.out.println("1. ADDITION");
            System.out.println("2. MULTIPLICATION");
            System.out.println("3. DIVISION");
            System.out.println("4. SUBTRACTION");
            System.out.println("5. RETURN");
            System.out.println("6. EXIT");
            System.out.print("Choose a suitable option: ");

            try {
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        sumObj.execute();
                        break;
                    case 2:
                        multiplicationObj.execute();
                        break;
                    case 3:
                        divisionObj.execute();
                        break;
                    case 4:
                        subtractionObj.execute();
                        break;
                    case 5:
                        junctionObj.calculatorJunction();
                        break;
                    case 6:
                        System.out.println("Exiting the program. Thank you!");
                        System.exit(0);

                    default:
                        System.out.println("Invalid option! Please enter a number between 1 and 5.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input\nChoose between [1, 2, 3, 4, 5, 6]");
                sc.next();
            }
        }

    }
}

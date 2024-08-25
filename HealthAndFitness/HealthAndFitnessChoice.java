package HealthAndFitness;

import Junction.Junction;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HealthAndFitnessChoice {
    public void chooser() {

        BMICalculator bMICalculatorObj = new BMICalculator();

        Junction junctionObj = new Junction();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n          <------ Health And Fitness Menu ------>");
            System.out.println("1. Body Mass Index (BMI)");
            System.out.println("2. RETURN");
            System.out.println("3. EXIT");
            System.out.print("Choose a suitable option: ");

            try {
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        bMICalculatorObj.execute();
                        break;
                    case 2:
                        junctionObj.calculatorJunction();
                        break;
                    case 3:
                        System.out.println("Exiting the program. Thank you!");
                        System.exit(0);

                    default:
                        System.out.println("Invalid option! Please enter a number between 1 and 4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input\nChoose between [1, 2, 3]");
                sc.next();
            }
        }
    }
}

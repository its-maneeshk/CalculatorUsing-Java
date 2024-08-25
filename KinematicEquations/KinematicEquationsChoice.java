package KinematicEquations;

import java.util.InputMismatchException;
import java.util.Scanner;

import Junction.Junction;

public class KinematicEquationsChoice {
    public void chooser() {

        DisplacementVelocityAcceleration displacementVelocityAcceleration = new DisplacementVelocityAcceleration();

        Junction junctionObj = new Junction();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n          <------ Calculate Displacement, Velocity and Acceleration Menu ------>");
            System.out.println("1. Displacement");
            System.out.println("2. Velocity");
            System.out.println("3. Acceleration");
            System.out.println("5. RETURN");
            System.out.println("4. EXIT");
            System.out.print("Choose a suitable option: ");

            try {
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        displacementVelocityAcceleration.executeDisplacement();
                        break;
                    case 2:
                        displacementVelocityAcceleration.executeVelocity();
                        break;
                    case 3:
                        displacementVelocityAcceleration.executeAcceleration();
                        break;
                    case 5:
                        junctionObj.calculatorJunction();
                        break;
                    case 4:
                        System.out.println("Exiting the program. Thank you!");
                        System.exit(0);

                    default:
                        System.out.println("Invalid option! Please enter a number between 1 and 4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input\nChoose between [1, 2, 3, 4, 5]");
                sc.next();
            }
        }
    }
}

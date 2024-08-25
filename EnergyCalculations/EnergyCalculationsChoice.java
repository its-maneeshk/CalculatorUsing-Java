package EnergyCalculations;

import java.util.InputMismatchException;
import java.util.Scanner;

import Junction.Junction;

public class EnergyCalculationsChoice {
    public void chooser() {

        KineticEnergy kineticEnergy = new KineticEnergy();
        PotentialEnergy potentialEnergy = new PotentialEnergy();

        Junction junctionObj = new Junction();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n          <------ Energy Calculation Menu ------>");
            System.out.println("1. Calculate Potential Energy");
            System.out.println("2. Calculate Kinetic Energy");
            System.out.println("3. RETURN");
            System.out.println("4. EXIT");
            System.out.print("Choose a suitable option: ");

            try {
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        kineticEnergy.executeKineticEnergy();
                        break;
                    case 2:
                        potentialEnergy.executePotentialEnergy();
                        break;
                    case 3:
                        junctionObj.calculatorJunction();
                        break;
                    case 4:
                        System.out.println("Exiting the program. Thank you!");
                        System.exit(0);

                    default:
                        System.out.println("Invalid option! Please enter a number between 1 and 4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input\nChoose between [1, 2, 3, 4]");
                sc.next();
            }
        }
    }
}

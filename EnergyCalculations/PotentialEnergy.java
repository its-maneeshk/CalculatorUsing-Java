package EnergyCalculations;

import java.util.Scanner;

public class PotentialEnergy {
        public void executePotentialEnergy() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the mass of the object (in kg): ");
            double mass = scanner.nextDouble();
    
            System.out.print("Enter the height of the object (in m): ");
            double height = scanner.nextDouble();
    
            System.out.print("Enter the acceleration due to gravity (in m/s^2): ");
            double gravity = scanner.nextDouble();
    
            double calculatePotentialEnergy = mass * gravity * height;
    
            System.out.println("\n--- Result ---");
            System.out.printf("The potential energy of the object is %.2f Joule%n", calculatePotentialEnergy);
            System.out.println("------------------");
    }
}

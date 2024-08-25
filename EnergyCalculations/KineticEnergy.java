package EnergyCalculations;

import java.util.Scanner;

public class KineticEnergy {
    public void executeKineticEnergy() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the mass of the object (in kg): ");
        double mass = sc.nextDouble();

        System.out.print("Enter the velocity of the object (in m/s): ");
        double velocity = sc.nextDouble();
        
        double calculateKineticEnergy = 0.5 * mass * velocity * velocity;

        System.out.println("\n--- Result ---");
        System.out.printf("The kinetic energy of the object is %.2f Joule%n", calculateKineticEnergy);
        System.out.println("------------------");
    }
}

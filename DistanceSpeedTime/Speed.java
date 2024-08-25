package DistanceSpeedTime;

import java.util.Scanner;

public class Speed {
        public void execute() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance (meters): ");
        double distance = sc.nextDouble();

        System.out.print("Enter time (seconds): ");
        double time = sc.nextDouble();

        double speed = distance / time;

        System.out.println("\n--- Result ---");
        System.out.println("The calculated speed is: " + speed + " m/s");
        System.out.println("------------------");
    }
}

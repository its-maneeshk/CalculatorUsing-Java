package DistanceSpeedTime;

import java.util.Scanner;

public class Distance {
        public void execute() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter speed (m/s): ");
        double speed = sc.nextDouble();

        System.out.print("Enter time (seconds): ");
        double time = sc.nextDouble();

        double distance = speed * time;

        System.out.println("\n--- Result ---");
        System.out.println("The calculated distance is: " + distance + " meters");
        System.out.println("------------------");
    }
}

package DistanceSpeedTime;

import java.util.Scanner;

public class Time {
        public void execute() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance (meters): ");
        double distance = sc.nextDouble();

        System.out.print("Enter speed (m/s): ");
        double speed = sc.nextDouble();

        double time = distance / speed;

        System.out.println("\n--- Result ---");
        System.out.println("The calculated time is: " + time + " seconds");
        System.out.println("------------------");
    }
}

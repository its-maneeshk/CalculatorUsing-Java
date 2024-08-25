package KinematicEquations;

import java.util.Scanner;

public class DisplacementVelocityAcceleration {

    public void executeVelocity() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- Velocity Calculation ---");

        System.out.print("Enter the displacement (in meters): ");
        double displacement = sc.nextDouble();

        System.out.print("Enter the time (in seconds): ");
        double time = sc.nextDouble();

        double velocity = displacement / time;

        System.out.println("\n--- Result ---");
        System.out.printf("%.2f meters displacement and %.2f seconds time is equal to %.2f m/s velocity%n", displacement, time, velocity);
        System.out.println("------------------");
    }

    public void executeAcceleration() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- Acceleration Calculation ---");

        System.out.print("Enter the initial velocity (in m/s): ");
        double initialVelocity = sc.nextDouble();

        System.out.print("Enter the final velocity (in m/s): ");
        double finalVelocity = sc.nextDouble();

        System.out.print("Enter the time (in seconds): ");
        double time = sc.nextDouble();

        double acceleration = (finalVelocity - initialVelocity) / time;

        System.out.println("\n--- Result ---");
        System.out.printf("%.2f m/s initial velocity, %.2f m/s final velocity, and %.2f seconds time is equal to %.2f m/s^2 acceleration%n", initialVelocity, finalVelocity, time, acceleration);
        System.out.println("------------------");
    }

    public void executeDisplacement() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- Displacement Calculation ---");

        System.out.print("Enter the initial velocity (in m/s): ");
        double initialVelocity = sc.nextDouble();

        System.out.print("Enter the acceleration (in m/s^2): ");
        double acceleration = sc.nextDouble();

        System.out.print("Enter the time (in seconds): ");
        double time = sc.nextDouble();

        double displacement = (initialVelocity * time) + (0.5 * acceleration * time * time);

        System.out.println("\n--- Result ---");
        System.out.printf("%.2f m/s initial velocity, %.2f m/s^2 acceleration, and %.2f seconds time is equal to %.2f meters displacement%n", initialVelocity, acceleration, time, displacement);
        System.out.println("------------------");
    }
}

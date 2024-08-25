package AngleConversion;

import java.util.Scanner;


public class ToDegreeRadian {
    public void executeDegreeToRadian() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- Conversion from Degree to Radian ---");

        System.out.print("Enter a value in degree: ");
        double userDegreeValue = sc.nextDouble();

        double radian = (userDegreeValue * (Math.PI)) / 180;

        System.out.println("\n--- Result ---");
        System.out.printf("%.2f degree is equal to %.2f radian%n", userDegreeValue, radian);
        System.out.println("------------------");
    }
    
    public void executeRadianToDegree() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- Conversion from Radian to Degree ---");

        System.out.print("Enter a value in radians: ");
        double userRadianValue = sc.nextDouble();

        double degrees = userRadianValue * (180.0 / Math.PI);

        System.out.println("\n--- Result ---");
        System.out.printf("%.2f radians is equal to %.2f degrees%n", userRadianValue, degrees);
        System.out.println("------------------");
    }
}

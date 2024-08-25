package HealthAndFitness;

import java.util.Scanner;

public class BMICalculator {

    public void execute() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- BMI Calculation ---");

        System.out.print("Please enter your weight (in kg): ");
        double weight = sc.nextDouble();

        System.out.print("Please enter your height (in meters): ");
        double height = sc.nextDouble();

        double bmi = calculateBMI(weight, height);

        System.out.println("\n--- Result ---");
        System.out.println("Your BMI is: " + String.format("%.2f", bmi));
        System.out.println("You are " + getBMICategory(bmi));
        System.out.println("------------------");
    }

    public double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "underweight";
        } else if (bmi < 25) {
            return "normal weight";
        } else if (bmi < 30) {
            return "overweight";
        } else {
            return "obese";
        }
    }
}

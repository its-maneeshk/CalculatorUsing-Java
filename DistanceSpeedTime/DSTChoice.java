package DistanceSpeedTime;

import Junction.Junction;
import java.util.Scanner;

public class DSTChoice {

    public void userChoice() {
        Distance distanceChoiceObj = new Distance();
        Speed speedChoiceObj = new Speed();
        Time timeChoiceObj = new Time();
        
        Junction junctionObj = new Junction();
        
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n          <------ Distance, Speed, Time Conversion Menu ------>");
            System.out.println("1. DISTANCE");
            System.out.println("2. SPEED");
            System.out.println("3. TIME");
            System.out.println("4. RETURN");
            System.out.println("5. EXIT");
            System.out.print("Choose a suitable option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    distanceChoiceObj.execute();
                    break;
                case 2:
                    speedChoiceObj.execute();
                    break;
                case 3:
                    timeChoiceObj.execute();
                    break;
                case 4:
                    junctionObj.calculatorJunction();
                    break;
                case 5:
                    System.out.println("Exiting the program. Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option! Please enter a number between 1 and 5.");
            }
        }
    }
}

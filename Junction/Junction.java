package Junction;

import AngleConversion.AngleCalculationChoice;
import DistanceSpeedTime.DSTChoice;
import EnergyCalculations.EnergyCalculationsChoice;
import HealthAndFitness.HealthAndFitnessChoice;
import KinematicEquations.KinematicEquationsChoice;
import Utilities.BasicCalculationChoice;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Junction {

    public static void calculatorJunction() {
        Scanner sc = new Scanner(System.in);

        BasicCalculationChoice basicCalculationsMain = new BasicCalculationChoice();
        DSTChoice DSTchoiceObj = new DSTChoice();
        AngleCalculationChoice angleCalculationChoiceObj = new AngleCalculationChoice();
        EnergyCalculationsChoice energyCalculationsChoiceObj = new EnergyCalculationsChoice();
        HealthAndFitnessChoice healthAndFitnessChoiceObj = new HealthAndFitnessChoice();
        KinematicEquationsChoice kinematicEquationsChoiceObj = new KinematicEquationsChoice();

        while (true) {
            System.out.println("\n          <------ Home ------>");
            System.out.println("Note: '*' marked option's functions are not defined yet!!!");
            System.out.println("1. ANGLE CONVERSION");
            System.out.println("2. BASIC CALCULATIONS");
            System.out.println("3. DISTANCE, SPEED, TIME CONVERSION");
            System.out.println("4. ENERGY CALCULATION");
            System.out.println("5. HEALTH AND FITNESS");
            System.out.println("6. KINEMATICS EQUATIONS");
            System.out.println("7. STATICTICS *");
            System.out.println("8. UNIT CONVERSION *");
            System.out.println("9. EXIT");
            System.out.print("\n    Choose a suitable option: ");

            try {
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        angleCalculationChoiceObj.chooser();
                        break;
                    case 2:
                        basicCalculationsMain.chooser();
                        break;
                    case 3:
                        DSTchoiceObj.userChoice();
                        break;
                    case 4:
                        energyCalculationsChoiceObj.chooser();
                        break;
                    case 5:
                        healthAndFitnessChoiceObj.chooser();
                        break;
                    case 6:
                        kinematicEquationsChoiceObj.chooser();
                        break;
                    case 7:
                        System.out.println("7th option function are not defined yet!!!");
                        break;
                    case 8:
                        System.out.println("8th option function are not defined yet!!!");
                        break;
                    case 9:
                        System.out.println("Exiting the program. Thank you!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid option! Please enter a number between 1 and 9.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input\nChoose between [1, 2, 3, 4, 5, 6, 7, 8, 9]");
                sc.next(); 
            }
        }
    }
}

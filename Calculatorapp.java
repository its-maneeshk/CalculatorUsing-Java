import Junction.Junction;
import Utilities.Greeting;
import Utilities.UserName;

public class Calculatorapp {
    public static void main(String[] args) {
        Greeting.printGreeting();
        UserName.userName() ;
        
        Junction.calculatorJunction();

        System.out.println("Terminating in 0.03s");
    }
}
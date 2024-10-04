package homework3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double eurUsa = 0.91;
        System.out.println("Enter s sum in $ EUR");
        double usa = getInput();
        double resEu = usaEer(usa, eurUsa);
        System.out.println("Your summ in EURO = " + resEu);


    }
    
    private static double getInput(){
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
    private static  double usaEer(double usa, double eurUsa){
        return usa * eurUsa;
    }
}

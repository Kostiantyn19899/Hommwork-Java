package homework3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        printInput1();
        double num1 = getInput();
        printInput2();
        double num2 = getInput();

        double resAdd = add(num1, num2);
        System.out.println(resAdd);

        double resSubtract = subtract(num1, num2);
        System.out.println(resSubtract);

        double resMultiplay = multiplay(num1, num2);
        System.out.println(resMultiplay);

        double resDivide = divide(num1, num2);
        System.out.println(resDivide);






    }
        private static double getInput(){
            Scanner sc = new Scanner(System.in);
            return sc.nextDouble();
        }

        public static void printInput1(){
            System.out.println("Enter number 1");
        }
        public static void printInput2(){
            System.out.println("Enter number 2");
        }

    private static double add(double num1, double num2){
        return num1 + num2;
    }
    private static double subtract(double num1, double num2){
        return num1 - num2;
    }
    private static double multiplay(double num1, double num2){
        return num1 * num2;
    }
    private static double divide(double num1, double num2){
        return num1 / num2;
    }


}

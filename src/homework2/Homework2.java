package homework2;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
 // ----------------------  1  ------------------------------------------------------
        String str = new String("I study Java");
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.contains("Java"));
        System.out.println(str.substring(8, 12));
        System.out.println(str.replace("a", "o"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

//------------------------  2  ------------------------------------------------------

        Scanner inputData = new Scanner(System.in);
        System.out.print("Enter num1 = ");
        double userNum1 = inputData.nextDouble();
        System.out.print("Enter num2 = ");
        double userNum2 = inputData.nextDouble();
        double res1 = add(userNum1, userNum2);
        double res2 = subtract(userNum1, userNum2);
        double res3 = multiplay(userNum1, userNum2);
        double res4 = divide(userNum1, userNum2);

        System.out.println("Result Add = " + res1);
        System.out.println("Result Subtract = " + res2);
        System.out.println("Result Multiplay = " + res3);
        System.out.printf("Result Divide = %.2f ",  res4);



    }
    private static double add(double userNum1, double userNum2){
        return userNum1 + userNum2;
    }
    private static double subtract(double userNum1, double userNum2){
        return userNum1 - userNum2;
    }
    private static double multiplay(double userNum1, double userNum2){
        return userNum1 * userNum2;
    }
    private static double divide(double userNum1, double userNum2){
        return userNum1 / userNum2;
    }



}

package homework2;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
 // ----------------------  1  ------------------------------------------------------
//        String str = new String("I study Java");
//        System.out.println(str.charAt(str.length()-1));
//        System.out.println(str.contains("Java"));
//        System.out.println(str.substring(8, 12));
//        System.out.println(str.replace("a", "o"));
//        System.out.println(str.toUpperCase());
//        System.out.println(str.toLowerCase());

//------------------------  2  ------------------------------------------------------

        Scanner inputData = new Scanner(System.in);
        System.out.print("Enter num1 = ");
        int userNum1 = inputData.nextInt();
        System.out.print("Enter num2 = ");
        int userNum2 = inputData.nextInt();
        int res1 = add(userNum1, userNum2);
        int res2 = subtract(userNum1, userNum2);
        int res3 = multiplay(userNum1, userNum2);
        int res4 = divide(userNum1, userNum2);

        System.out.println("Result Add = " + res1);
        System.out.println("Result Subtract = " + res2);
        System.out.println("Result Multiplay = " + res3);
        System.out.println("Result Divide = " + res4);



    }
    private static int add(int userNum1, int userNum2){
        return userNum1 + userNum2;
    }
    private static int subtract(int userNum1, int userNum2){
        return userNum1 - userNum2;
    }
    private static int multiplay(int userNum1, int userNum2){
        return userNum1 * userNum2;
    }
    private static int divide(int userNum1, int userNum2){
        return userNum1 / userNum2;
    }



}

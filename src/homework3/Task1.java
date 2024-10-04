package homework3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter even String one");
        String userInputOne = getInput();
        System.out.println("Enter even String too");
        String userInputToo = getInput();

        int resEvenOne = userInputOne.length();
            //System.out.println(resEvenOne);
        int halbResOne = arrHalbOne(resEvenOne);
            //System.out.println(halbResOne);

        int resEvenToo = userInputToo.length();
            //System.out.println(resEvenToo);
        int halbResToo = arrHalbToo(resEvenToo);
            //System.out.println(halbResToo);



        System.out.println(userInputOne.substring(0, halbResOne) + userInputToo.substring(halbResToo));




    }

        private static String getInput(){
            Scanner inputDate = new Scanner(System.in);
            return inputDate.next();
        }



        private static int arrHalbOne(int resEvenOne ){
            return resEvenOne / 2;
        }

        private static int arrHalbToo(int resEvenToo ){
            return resEvenToo / 2;
        }
}

package homework1610;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10, 99);
        }
        System.out.println(Arrays.toString(arr));
        boolean yesNot = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                yesNot = false;
                break;
            }
        }

        if (yesNot) {
            System.out.println("Массив строгого возрастания");
        } else {
            System.out.println("Массив не строгого возрастания");
        }
    }
}

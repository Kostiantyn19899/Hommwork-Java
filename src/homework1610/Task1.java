package homework1610;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1,50);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0 ){
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


}

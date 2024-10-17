package homework1610;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int n = 10;
        int sumN = 0;
        int sumArr = 0;
        int[] arr = {6,1,2,8,3,4,7,10,5};
        for (int i = 1; i < n+1; i++) {
            sumN = sumN + i;
        }
        for (int i : arr) {
            sumArr = sumArr + i;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Summa N = " + sumN);
        System.out.println("Summa Arr = " + sumArr);
        System.out.println("Недостающий элемент = " + (sumN - sumArr));
    }
}

package homework1410;

public class Task2 {
    public static void main(String[] args) {
        int sumN = 21;
        System.out.println("Всего на остатке " + sumN);
        methodTwo(sumN);
    }

    private static void methodTwo(int sumN) {
        int day = 0;
        int res;
        while (sumN >= 1) {
            day++;
            res = methodOne(sumN);
            sumN = sumN -res;

            System.out.println("На " + day + " день" + " Снято = " + res + "   Остаток = " + sumN);
        }
    }

    private static int methodOne(int sumN) {
        if (sumN != 1) {
            for (int i = sumN - 1; i > 1; i--) {
                if (sumN % i == 0) {
                    return i;
                }
            }
        }
        return 1;
    }
}


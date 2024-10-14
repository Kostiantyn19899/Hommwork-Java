package homework1410;

public class Task1 {
    public static void main(String[] args) {
        int temperature1 = 100;
        int temperature2 = 90;
        System.out.println(methodOne(temperature1, temperature2));
    }

    private static boolean methodOne(int temp1, int temp2) {
        return temp1 == 100 && temp2 == 100;
    }
}

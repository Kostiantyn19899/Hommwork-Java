package homework1410;

public class Task3 {
    public static void main(String[] args) {
        int floorH = 200;
        int stepUp = 50;
        int stepDown = 1;
        numberOfLifts(floorH, stepUp, stepDown);

    }

    private static void numberOfLifts(int floorH, int stepUp, int stepDown) {
        int result = 0;
        int sumUp = 0;

        while (floorH > result) {
            sumUp++;
            if ((result + (stepUp - stepDown)) <= floorH) {
                result = result + (stepUp - stepDown);
                System.out.println("Подьём № = " + sumUp + " равен " + result + "этажей");
            } else {
                System.out.println("Вы поднялись на последний этаж");
                break;
            }
        }

    }
}

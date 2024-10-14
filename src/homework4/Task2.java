package homework4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int randNum = rand.nextInt(0, 28800);
        System.out.println("Time in seconds = " + randNum);
        if (randNum == 0) {
            System.out.println("Time is app");
        } else if (randNum <= 3600) {
            System.out.println("Осталось меньше часа");
        } else if (randNum <= 7200) {
            System.out.println("Осталось 2 часов");
        } else if (randNum <= 10800) {
            System.out.println("Осталось 3 часов");
        } else if (randNum <= 14400) {
            System.out.println("Осталось 4 часов");
        } else if (randNum <= 18000) {
            System.out.println("Осталось 5 часов");
        } else if (randNum <= 21600) {
            System.out.println("Осталось 6 часов");
        } else if (randNum <= 25200) {
            System.out.println("Осталось 7 часов");
        } else if (randNum <= 28800) {
            System.out.println("Осталось 8 часов");
        }
    }
}

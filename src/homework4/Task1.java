package homework4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter m = ");
        double m = sc.nextDouble();
        System.out.print("Enter n = ");
        double n = sc.nextDouble();


        if (m > 10 && m < n){
            System.out.println("Число " + m + " ближе к 10");
        } else if (m < 10 && m > n) {
            System.out.println("Число " + m + " ближе к 10");
        } else {
            System.out.println("Число " + n + " ближе к 10");
        }
    }
}

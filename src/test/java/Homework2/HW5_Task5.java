package Homework2;

import java.util.Scanner;

public class HW5_Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Temp ");
        int temp = scanner.nextInt();


        if (temp < 0) {
            System.out.println("Freezing weather.");
        } else if (temp >= 0 && temp < 10) {
            System.out.println("Very Cold weather.");
        } else if (temp >= 10 && temp < 20) {
            System.out.println("Cold weather.");
        } else if (temp >= 20 && temp < 30) {
            System.out.println("Normal in Temp.");
        } else if (temp >= 30 && temp < 40) {
            System.out.println("Its Hot.");
        } else {
            System.out.println("Its Very Hot.");
        }


    }
}
package Homework2;

import java.util.Scanner;

public class HW5_Task2 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your walking steps");
        int walkingsteps = scanner.nextInt();

        if (walkingsteps < 5000) {
            System.out.println("Basic activity.");
        } else if (walkingsteps >= 5000 && walkingsteps < 10000) {
            System.out.println("Moderate activity.");
        } else if (walkingsteps >= 10000 && walkingsteps < 15000) {
            System.out.println("High activity.");
        } else {
            System.out.println("Intense activity.");
        }


    }
}

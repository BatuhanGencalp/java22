package Homework2;

import java.util.Scanner;

public class HW5_Task4 {
    public static void main(String[] args) {

            Scanner scanner= new Scanner(System.in);
            System.out.println("Enter your age:");
            int userAge = scanner.nextInt();

            if (userAge < 13) {
                System.out.println("You can watch G- rated movies.");
            } else if (userAge >= 13 && userAge < 17) {
                System.out.println("You can watch PG-13 movies.");
            } else if (userAge >= 17 && userAge < 21) {
                System.out.println(" You can watch R-rated movies.");
            } else {
                System.out.println("You can watch all movies .");
            }


        }
    }

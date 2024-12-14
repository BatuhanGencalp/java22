package Homework2;

import java.util.Scanner;

public class HW5_Task1 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your water usage");
        int usageLimit = scanner.nextInt();

        if (usageLimit < 2000) {
            System.out.println("Congratulations You have low water usage.");
        } else if (usageLimit >= 2000 && usageLimit < 3000) {
            System.out.println("You are within the normal range.");
        } else if (usageLimit >= 3000 && usageLimit < 4000) {
            System.out.println("Please conserve water.");
        } else {
            System.out.println("You will be receive a fine..");
        }


    }
}

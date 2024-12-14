package Homework2;

import java.util.Scanner;

public class HW4_Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = scanner.nextInt();
        System.out.println("Please enter your Consent (true/false)");
        boolean consent = scanner.nextBoolean();

        if (age <=18 ){
            System.out.println("False");
        }else if ( age < 21 && consent || (age >= 22) ){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }
}
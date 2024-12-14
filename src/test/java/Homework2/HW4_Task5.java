package Homework2;

import java.util.Scanner;

public class HW4_Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first exam score:");
        double firsExam = scanner.nextInt();
        System.out.println("Please enter your second exam score");
        double secondExam = scanner.nextInt();
        System.out.println("Please enter your third exam score");
        double thirdExam = scanner.nextInt();
        System.out.println("Please enter your class attendance ");
        double classattendance = scanner.nextInt();

        double last = firsExam * 0.2 + secondExam * 0.3 + thirdExam * 0.5;

        if (last <=65 && classattendance <80 ){
            System.out.println("You have failed");
        }else{
            System.out.println("Congratulations");
        }

    }
}


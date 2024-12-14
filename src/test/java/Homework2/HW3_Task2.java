package Homework2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HW3_Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three numbers:");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        int firstCalculate = firstNumber * firstNumber;
        int secondCalculate = secondNumber * secondNumber;
        int thirdCalculate = thirdNumber * thirdNumber;
        System.out.println("Square of numbers:");
        System.out.println(firstCalculate);
        System.out.println(secondCalculate);
        System.out.println(thirdCalculate);
        int sumofNumber = firstCalculate + secondCalculate + thirdCalculate;
        System.out.println("Sum Of numbers:");
        System.out.println(sumofNumber);



    }
}

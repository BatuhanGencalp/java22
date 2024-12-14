package Homework2;

import java.util.Scanner;

public class HW5_Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Enter your annual income: ");
        double annualIncome = scanner.nextDouble();
        System.out.println("Enter your credit score: ");
        int creditScore = scanner.nextInt();
        System.out.println("Do you have a cosigner? (true/false): ");
        boolean hasCosigner = scanner.nextBoolean();


        if (age >= 21 && age <= 65 && annualIncome >= 30000) {
            if (creditScore >= 700 || hasCosigner) {
                System.out.println("Loan Approved");
            } else if (creditScore < 700) {
                System.out.println("Loan denied");
            } else {
                System.out.println("Loan Denied");
        }

    }}}

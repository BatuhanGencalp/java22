package Homework2;

import java.util.Scanner;

public class HW4_Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter worked days: ");
        int daysWorked = scanner.nextInt();
        System.out.println("Enter worked hours: ");
        int hoursWorked = scanner.nextInt();
        System.out.println("Enter late arrivals: ");
        int lateArrivals = scanner.nextInt();

        boolean total = (daysWorked >= 20 || hoursWorked >= 160) && lateArrivals <=2;
        System.out.println(total);






    }
}

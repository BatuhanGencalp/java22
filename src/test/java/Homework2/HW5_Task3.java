package Homework2;

import java.util.Scanner;

public class HW5_Task3 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your electricity usage in units: ");
    int usage = scanner.nextInt();
    double billAmount = 0.0;


    if (usage <= 100) {
        billAmount = usage * 0.50;
    } else if (usage <= 300) {
        billAmount = (100 * 0.50) + ((usage - 100) * 0.75);
    } else if (usage <= 500) {
        billAmount = (100 * 0.50) + (200 * 0.75) + ((usage - 300) * 1.20);
    } else {
        billAmount = (100 * 0.50) + (200 * 0.75) + (200 * 1.20) + ((usage - 500) * 1.50);
    }


    System.out.printf("Your total electricity bill is: $%.2f%n", billAmount);

}
}

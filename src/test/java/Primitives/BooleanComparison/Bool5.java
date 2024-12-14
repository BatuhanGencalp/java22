package Primitives.BooleanComparison;

import java.util.Scanner;

public class Bool5 {
        //    We should create a program to calculate if there is
        //    still a ticket for the game tonight. We are given two
        //    variables: Capacity of the stadium and the amount of
        //    tickets sold.  Print True if I can still buy a ticket,
        //    False otherwise.
        //    NOTE! USER will enter the capacity and amount of
        //    tickets sold.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the capacity of the stadium on next line");
        int capacityOfStad = scanner.nextInt();

        // learn amouth of tickets sold
        System.out.println("Enter the number of tickets sold so far");
        int ticketsSold = scanner.nextInt();

        // What should I do learn that if there is a ticket left for the game ?
        boolean isTicketLeft = capacityOfStad > ticketsSold;
        System.out.println("Is there a ticket for the game?" + isTicketLeft);






    }
}

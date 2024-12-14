package Primitives.BooleanComparison;

import java.util.Scanner;

public class Bool6 {

    //    Scenario: A sports shop offers a buy-one-get-one-half-off deal. The user inputs
    //    the price of the first item and the price of the second item. The goal is to calculate the
    //    total cost under the deal and determine if the total cost exceeds $50
    //
    //     Take two inputs for the item prices.
    //    Calculate the total cost, applying the discount on the second item (half off).
    //    Print true if the cost is below $50, otherwise print false.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First item price");
        double firstItemPrice = scanner.nextInt();

        System.out.println("Second item price");
        double secondItemPrice = scanner.nextInt();

        // %50 of second item = secondItem/2 or secondItem *0.5
        double totalCost = firstItemPrice + secondItemPrice /2;

        boolean isTotalBelow50 = totalCost < 50;
        System.out.println("Is the cost less than 50?"+ isTotalBelow50);












    }








}

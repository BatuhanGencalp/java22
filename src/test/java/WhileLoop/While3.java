package WhileLoop;

import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ask user to  enter a number in between 1000 and 2000(both inclusive).
        // Keep asking until they enter the expected number. If they enter number in between 1000 and 2000 inclusive
        // then print (you entered the number in expected range.)
//        boolean isUnexpectedNum = true;
//        while (isUnexpectedNum){
//            System.out.println("Enter a number: ");
//            int number = sc.nextInt();
//            isUnexpectedNum = number < 1000 || number > 2000;
//        }
//        System.out.println("you entered the number in expected range.");

        boolean isExpected = false;
        while (!isExpected){
            System.out.println("Enter a number: ");
            int number = sc.nextInt();
            isExpected = number >= 1000 && number <= 2000;
        }
        System.out.println("you entered the number in expected range.");

    }
}
package Homework2;

import java.util.Scanner;

public class HW4_Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your password length:");
        int passwordlength = scanner.nextInt();
        System.out.println("Does your password has a special characters ? (true/ false)");
        boolean specialcharecter = scanner.nextBoolean();
        System.out.println(" Does your password has a space ? (true/ false)");
        boolean hasaspace = scanner.nextBoolean();



        if (passwordlength <8 ){
            System.out.println("False");
        }else if ( specialcharecter  && !hasaspace ){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }
}

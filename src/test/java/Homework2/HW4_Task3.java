package Homework2;

import java.util.Scanner;

public class HW4_Task3 {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your order amount:");
            double orderAmouth = scanner.nextDouble();
            System.out.println("Are you premium member ? (true/ false)");
            boolean premiummember = scanner.nextBoolean();
            System.out.println(" Is it restricted item ? (true/ false)");
            boolean restricteditem = scanner.nextBoolean();



            if (orderAmouth <=50 ){
                System.out.println("False");
            }else if ( premiummember  && restricteditem ){
                System.out.println("True");
            }else{
                System.out.println("False");
            }

        }
    }

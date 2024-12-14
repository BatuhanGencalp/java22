package Homework2;

import java.util.Scanner;

public class HW3_Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Three Number:");
        int firstNumber = scanner.nextInt();
        int secondnumber = scanner.nextInt();
        int thirdnumber = scanner.nextInt();

        boolean lastNum = ( firstNumber == secondnumber ) && ( secondnumber == thirdnumber) ;

        System.out.println( lastNum);



    }
}

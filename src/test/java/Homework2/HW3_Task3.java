package Homework2;

import java.util.Scanner;

public class HW3_Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of the Rectangle:");
        double  lengthRectangle = scanner.nextDouble();
        System.out.println("Please enter the width of the Rectangle:");
        double widthRectangle = scanner.nextDouble();

        double output = lengthRectangle * widthRectangle ;
        System.out.println((int) output);


    }
}

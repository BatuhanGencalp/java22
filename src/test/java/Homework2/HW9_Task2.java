package Homework2;

import java.util.Arrays;
import java.util.Scanner;

public class HW9_Task2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("These are the strings available: [ Liam, Emma, Noah, Olivia, William ]");
        System.out.println("Please enter the new String:");
        String givenName = scanner.nextLine();

        System.out.println("Enter the index number of the string to be changed:");
        int number = scanner.nextInt();

        String[] availableNames = {"Liam","Emma","Noah","Olivia","William"};

       if (number >=0 && number < availableNames.length){
           availableNames[number] = givenName;

           System.out.println(Arrays.toString(availableNames));
       }else {
           System.out.println("Its not a valid index number");
       }








    }
}

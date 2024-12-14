package Homework2;

import java.util.Arrays;
import java.util.Scanner;

public class HW9_Task1 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Choose the number you want to convert to 0 among these {10,4,3,55,32,145,443,234,98,32} numbers.");
        int number = scanner.nextInt();
        int[] numbers = new int []{10,4,3,55,32,145,443,234,98,32};

        boolean numberss = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number )
                numbers[i] = 0;


        }
        System.out.println(Arrays.toString(numbers));



    }
}

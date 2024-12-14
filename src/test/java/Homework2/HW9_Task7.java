package Homework2;

public class HW9_Task7 {
    public static void main(String[] args) {

        int[] numbers = {2, 3, 5, 7, 11, 13};
        for (int num : numbers) {
            System.out.println("Multiplication table for " + num + ":");

            for (int i = 1; i <= numbers.length; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }

        }
    }
}
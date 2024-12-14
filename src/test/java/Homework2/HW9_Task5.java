package Homework2;

import java.util.Arrays;

public class HW9_Task5 {
    public static void main(String[] args) {
        double[] numbers={46.7,52.0,65.7,77.0,42.1,55.9};


        for (int i = 0; i < numbers.length; i++) {
            double celsius = (numbers[i] - 32) * 5 / 9;
            System.out.println(celsius);

        }




    }
}

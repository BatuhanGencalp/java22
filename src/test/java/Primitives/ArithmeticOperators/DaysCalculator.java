package Primitives.ArithmeticOperators;

public class DaysCalculator {
    public static void main(String[] args) {
        int daytomin = 1440;
        int daytoyear = 525600;
        int Calculator = 858444;  // Enter numbers here
        int Formcalculatoryear = Calculator / daytoyear;
        int leftcalculateryear = Calculator - daytoyear * Formcalculatoryear;
        int leftdaytomday = leftcalculateryear / daytomin;
        System.out.println( Calculator + " minutes is approximately " + Formcalculatoryear + " years and " + leftdaytomday + " days");






    }
}

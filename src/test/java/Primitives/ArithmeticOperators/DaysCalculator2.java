package Primitives.ArithmeticOperators;

public class DaysCalculator2 {
    public static void main(String[] args) {

        int Daytomin = 1440, Mintoyear = 525600;
        int MinCalculator = 858444;
        int Leftofyear = MinCalculator % Mintoyear;
        int Numberleftyear = MinCalculator / Mintoyear;
        int Numberleftmin = Leftofyear / Daytomin;
        System.out.println( MinCalculator + " minutes is approximately "
                + Numberleftyear + " years and " + Numberleftmin + " days");




    }
}

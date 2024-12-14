package Primitives.Casting;

public class CastingEx1 {
    public static void main(String[] args) {
        float f = 41;
        // What is the daya type of variable f?
        //float
        int num = (int)f; // The variable f is explicily cast to integeer type.
        System.out.println("the variable f is "+ f); // 41.0
        System.out.println("The variable num is "+ num); // 41

        // Casting from decimal number to a whole number will always
        // get rid of all the decimal  part. No rounding will happen.

        double d1= 47.99;
        byte b = (byte)d1;
        System.out.println("double variable with value 47.99 casted to byte "+b); // it will be 47





    }
}

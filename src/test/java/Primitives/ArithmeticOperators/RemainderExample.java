package Primitives.ArithmeticOperators;

public class RemainderExample {

    public static void main(String[] args) {


        int Quarter = 25, Dimes = 10, Nickles = 5, Pennies = 1;
        int CustomerMoney = 99;
        int QuarterLeft = CustomerMoney % Quarter;
        int QuarterNumber = CustomerMoney / Quarter;
        System.out.println("Quarters "+ QuarterNumber);
        int DimesLeft = QuarterLeft % Dimes;
        int DimesNumber = QuarterLeft / Dimes;
        System.out.println("Dimes "+ DimesNumber);
        int NicklesLeft = DimesLeft % Nickles;
        int NicklesNumber = DimesLeft / Nickles;
        System.out.println("Nickles " +NicklesNumber);
        int PenniesNumber = NicklesLeft / Pennies;
        System.out.println("Pennies "+ PenniesNumber);

    }
}

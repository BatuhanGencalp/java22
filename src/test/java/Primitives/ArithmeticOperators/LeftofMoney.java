package Primitives.ArithmeticOperators;

public class LeftofMoney {

    public static void main(String[] args) {

        int quarters = 25, dimes = 10, nickles = 5, pennies = 1;
        int customerMoney = 55; // Enter Numbers Here
        int totalquarters = customerMoney / quarters;
        int leftofquarters = customerMoney - totalquarters * quarters;
        System.out.println("Total money of Customer :" + customerMoney + " cents");
        System.out.println("Quarters :" + totalquarters);
        int totaldimes = leftofquarters / dimes;
        int leftofdimes = customerMoney - (totalquarters * quarters + totaldimes * dimes);
        System.out.println("Dimes :" + totaldimes);
        int totalnickles = leftofdimes / nickles;
        System.out.println("Nickles :" + totalnickles);
        int leftofpennies = customerMoney - (totalquarters * quarters + totaldimes * dimes + totalnickles * nickles);
        int totalpennies = leftofpennies / pennies;
        System.out.println("Pennies :" + totalpennies);










    }
}

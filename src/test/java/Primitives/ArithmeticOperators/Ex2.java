package Primitives.ArithmeticOperators;

public class Ex2 {
    public static void main(String[] args) {
        int elephants = 8, tigers =12, parrots = 24,
                elphDaily = 50, tigDaily = 20, prDaily = 2;
        int allTigersDaily = tigers * tigDaily;
        int allElephantsDaily = elephants * elphDaily;
        int allParrotsDaily = parrots * prDaily;
        // To find what all animals eat daily I should find some of
        // all different animals
        int allAnimalsDaily = allTigersDaily + allElephantsDaily + allParrotsDaily;
        System.out.println("All animals eat total of " + allAnimalsDaily + "kg daily.");
        int allAnimalsMonthly = 30 * allAnimalsDaily;
        System.out.println("All animals eat total of " + allAnimalsMonthly + "kg monthly.");
        int allAnimalsYearly = 365 * allAnimalsDaily;
        System.out.println("All animals eat total of " + allAnimalsYearly + "kg yearly.");




    }
}

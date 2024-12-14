public class HW8_Task2 {

    public static void main(String[] args) {
        int totalSum = 0;

        System.out.println("Numbers between 100 and 200, divisible by 11:");

        for (int num = 100; num <= 200; num++) {
            if (num % 11 == 0) {
                System.out.print(num + " ");
                totalSum += num;
            }
        }

        System.out.println("\nThe sum: " + totalSum);
    }
}

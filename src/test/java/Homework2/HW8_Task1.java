import java.sql.SQLOutput;

public class HW8_Task1 {
    public static void main(String[] args) {
        // Define the number of lines you want to print
        int rows = 6;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("1");
            }
            System.out.println();
        }
    }
}

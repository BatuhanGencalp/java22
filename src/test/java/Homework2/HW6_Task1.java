package Homework2;

import java.util.Scanner;

public class HW6_Task1 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter priority (High, Medium, Low): ");
            String priority = scanner.nextLine();

            System.out.println("Is there a critical bug associated with the test case? (true/false): ");
            boolean hasCriticalBug = scanner.nextBoolean();

            System.out.println("Enter the number of hours since the test case was last executed: ");
            int lastExecutionHours = scanner.nextInt();

            scanner.nextLine(); // Consume newline

            System.out.println("Enter environment status (Ready, Not Ready): ");
            String environmentStatus = scanner.nextLine();

            // Determine if the test case can be executed
            if (!environmentStatus.equals("Ready")) {
                System.out.println("Test Case Skipped: Environment Not Ready");
            } else if (lastExecutionHours < 24) {
                System.out.println("Test Case Skipped: Execution Too Recent");
            } else if (isEligibleForExecution(priority, hasCriticalBug)) {
                System.out.println("Test Case Executed");
            } else {
                System.out.println("Test Case Skipped: Not Eligible");
            }

        }

        private static boolean isEligibleForExecution(String priority, boolean hasCriticalBug) {
            return "High".equals(priority) || ("Medium".equals(priority) && hasCriticalBug);
        }
    }


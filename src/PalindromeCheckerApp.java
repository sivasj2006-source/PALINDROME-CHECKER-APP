import java.util.Scanner;

public class PalindromeCheckerApp {

    // Method to check palindrome
    public static boolean isPalindrome(String input) {

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Palindrome Checker Menu =====");
            System.out.println("1. Check Palindrome");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter a string: ");
                    String input = scanner.nextLine();

                    if (isPalindrome(input)) {
                        System.out.println("Result: \"" + input + "\" is a Palindrome");
                    } else {
                        System.out.println("Result: \"" + input + "\" is NOT a Palindrome");
                    }
                    break;

                case 2:
                    System.out.println("Exiting the application...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 2);

        scanner.close();
    }
}
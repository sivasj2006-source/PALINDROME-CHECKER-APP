import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker App ===");
        System.out.print("Enter text: ");

        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("It is NOT a Palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String input) {

        // Remove spaces & convert to lowercase
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        String reversed = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(reversed);
    }
}
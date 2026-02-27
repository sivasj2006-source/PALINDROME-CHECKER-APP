import java.util.Scanner;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker App ===");
        System.out.print("Enter a word: ");

        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String input) {

        String reversed = new StringBuilder(input).reverse().toString();

        return input.equalsIgnoreCase(reversed);
    }
}}
import java.util.Scanner;

public class PalindromeCheckerApp {

    // Method to check palindrome after normalization
    public static boolean isPalindrome(String input) {

        // Remove spaces and convert to lowercase
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("UC10: Case-Insensitive & Space-Ignored Palindrome Checker");
        System.out.print("Enter a string: ");

        String input = scanner.nextLine();

        boolean result = isPalindrome(input);

        if (result) {
            System.out.println("Result: \"" + input + "\" is a Palindrome (ignoring spaces & case)");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a Palindrome");
        }

        scanner.close();
    }
}
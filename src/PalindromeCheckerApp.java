import java.util.Scanner;

// Palindrome service class (Encapsulation)
class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String input) {

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
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("UC11: Object-Oriented Palindrome Service");
        System.out.print("Enter a string: ");

        String input = scanner.nextLine();

        // Create object of service class
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("Result: \"" + input + "\" is a Palindrome");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a Palindrome");
        }

        scanner.close();
    }
}
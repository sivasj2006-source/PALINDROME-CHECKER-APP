import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    // Algorithm 1: Two Pointer Method
    public static boolean twoPointerPalindrome(String input) {

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

    // Algorithm 2: Stack Method
    public static boolean stackPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();

        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return input.equals(reversed.toString());
    }

    // Algorithm 3: Recursive Method
    public static boolean recursivePalindrome(String str, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return recursivePalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("UC13: Performance Comparison of Palindrome Algorithms");
        System.out.print("Enter a string: ");

        String input = scanner.nextLine();

        // Two Pointer Performance
        long start1 = System.nanoTime();
        boolean r1 = twoPointerPalindrome(input);
        long end1 = System.nanoTime();

        // Stack Performance
        long start2 = System.nanoTime();
        boolean r2 = stackPalindrome(input);
        long end2 = System.nanoTime();

        // Recursive Performance
        long start3 = System.nanoTime();
        boolean r3 = recursivePalindrome(input, 0, input.length() - 1);
        long end3 = System.nanoTime();

        System.out.println("\n===== Performance Results =====");
        System.out.println("Two Pointer Method : " + (end1 - start1) + " ns");
        System.out.println("Stack Method       : " + (end2 - start2) + " ns");
        System.out.println("Recursive Method   : " + (end3 - start3) + " ns");

        scanner.close();
    }
}
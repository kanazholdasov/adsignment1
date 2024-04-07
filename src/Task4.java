/**
 * This method calculates the factorial of a number using recursion.
 * The base case is when n is 0, in which case 1 is returned.
 * Otherwise, the method calls itself with n-1 and multiplies the result by n.
 * Time complexity: O(n), where n is the input number.
 * @param n The number for which factorial needs to be calculated.
 * @return The factorial of the input number.
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n));
        scanner.close();
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

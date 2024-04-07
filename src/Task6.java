/**
 * This method computes the result of raising a to the power of n using recursion.
 * The base case is when n is 0, in which case 1 is returned.
 * Otherwise, the method calls itself recursively with n-1,
 * and multiplies the result by a to compute a^n.
 * Time complexity: O(n), where n is the exponent.
 * @param a The base.
 * @param n The exponent.
 * @return The result of a raised to the power of n.
 */

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the inputs
        int a = scanner.nextInt();
        int n = scanner.nextInt();

        // Computing a^n
        System.out.println(power(a, n));

        scanner.close();
    }

    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * power(a, n - 1);
    }
}

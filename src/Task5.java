/**
 * This method finds the nth Fibonacci number using recursion.
 * The base cases are when n is 0 or 1, in which case 0 or 1 is returned, respectively.
 * Otherwise, the method calls itself recursively with n-1 and n-2,
 * and adds the results to compute the nth Fibonacci number.
 * Time complexity: O(2^n), where n is the input number.
 * @param n The index of the Fibonacci number to find.
 * @return The nth Fibonacci number.
 */

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(fibonacci(n));

        scanner.close();
    }


    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

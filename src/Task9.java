/**
 * This method calculates the binomial coefficient C(n, k) recursively
 * using the formula C(n, k) = C(n-1, k-1) + C(n-1, k).
 * It returns 1 if k is 0 or n, as these are the base cases where C(n, k) = 1.
 * Time complexity: O(2^n), where n is the value of n.
 * The recursion tree has 2 branches at each level, resulting in exponential time complexity.
 * @param n The total number of items.
 * @param k The number of items to choose.
 * @return The binomial coefficient C(n, k).
 */

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int result = binomialCoefficient(n, k);

        System.out.println(result);

        scanner.close();
    }


    public static int binomialCoefficient(int n, int k) {

        if (k == 0 || k == n) {
            return 1;
        }

        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }
}

/**
 * This method calculates the greatest common divisor (GCD) of two numbers a and b
 * using the Euclidean Algorithm.
 * It returns b if b divides a evenly (a % b == 0), otherwise recursively calls itself with (b, a % b).
 * Time complexity: O(log(min(a, b))), where a and b are the input numbers.
 * The algorithm has logarithmic time complexity due to the recursive calls reducing the problem size rapidly.
 * @param a The first number.
 * @param b The second number.
 * @return The greatest common divisor (GCD) of a and b.
 */

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = gcd(a, b);

        System.out.println(result);

        scanner.close();
    }

    public static int gcd(int a, int b) {

        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}

/**
 * This method checks if a string consists only of digits.
 * It uses regular expression to match the string against the pattern "\\d+",
 * which matches one or more digits.
 * Time complexity: O(n), where n is the length of the string.
 * The regular expression matching takes linear time.
 * @param s The input string to be checked.
 * @return true if the string consists only of digits, false otherwise.
 */

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        if (isAllDigits(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }

    public static boolean isAllDigits(String s) {
        return s.matches("\\d+");
    }
}

/**
 * This method returns the average of numbers in an array.
 * It iterates through the array using a for loop to calculate the sum,
 * then divides the sum by the length of the array to find the average.
 * Time complexity: O(n), where n is the length of the input array.
 * @param arr The array of integers for which we need to calculate the average.
 * @return The average of the numbers in the array.
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        double average = calculateAverage(arr, n);
        System.out.println(average);
        scanner.close();
    }

    public static int calculateSum(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        int sum = calculateSum(arr, n - 1);
        return sum + arr[n - 1];
    }

    public static double calculateAverage(int[] arr, int n) {
        int sum = calculateSum(arr, n);
        return (double) sum / n;
    }
}

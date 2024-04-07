/**
 * This method reverses an array in place using recursion.
 * It swaps the first and last elements of the array,
 * then recursively calls itself with start+1 and end-1.
 * The recursion continues until start is greater than or equal to end.
 * Time complexity: O(n/2), where n is the number of elements in the array.
 * @param arr The array to be reversed.
 * @param start The starting index of the subarray.
 * @param end The ending index of the subarray.
 */

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        reverseArray(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }


    public static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start + 1, end - 1);
    }
}

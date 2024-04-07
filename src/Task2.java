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

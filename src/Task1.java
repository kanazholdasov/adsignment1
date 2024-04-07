import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(findMinimum(arr, n));

        scanner.close();
    }

    public static int findMinimum(int[] arr, int n) {

        if (n == 0) {
            System.out.println("error");
            return 0;
        }

        if (n == 1) {
            return arr[0];
        }

        int min = findMinimum(arr, n - 1);

        return Math.min(min, arr[n - 1]);
    }
}

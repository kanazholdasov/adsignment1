import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Prime(n) ? "Prime" : "Composite");
        scanner.close();
    }

    public static boolean Prime(int n) {
        if (n <= 1) {
            return false;
        }
        return isPrime(n, 2);
    }

    public static boolean isPrime(int n, int divisor) {
        if (divisor > Math.sqrt(n)) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return isPrime(n, divisor + 1);
    }
}

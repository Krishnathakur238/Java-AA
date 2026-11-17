import java.util.Scanner;

public class Q17_ArraySumAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements (n): ");
        int n = sc.nextInt();

        double[] arr = new double[n];
        double sum = 0;

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }

        double average = (n > 0) ? (sum / n) : 0;
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f%n", average);
        sc.close();
    }
}

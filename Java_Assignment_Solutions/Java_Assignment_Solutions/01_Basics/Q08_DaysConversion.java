import java.util.Scanner;

public class Q08_DaysConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of days: ");
        int totalDays = sc.nextInt();

        int years = totalDays / 365;
        int remainingAfterYears = totalDays % 365;
        int weeks = remainingAfterYears / 7;
        int days = remainingAfterYears % 7;

        System.out.println(totalDays + " days = " + years + " year(s), " + weeks + " week(s), and " + days + " day(s).");
        sc.close();
    }
}

import java.util.Scanner;

public class Q12_StringEqualsIgnoreCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("The two strings are equal (ignoring case).");
        } else {
            System.out.println("The two strings are NOT equal.");
        }
        sc.close();
    }
}

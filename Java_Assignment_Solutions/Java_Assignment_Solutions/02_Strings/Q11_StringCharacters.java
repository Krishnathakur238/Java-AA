import java.util.Scanner;

public class Q11_StringCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (str.length() > 0) {
            System.out.println("First character: " + str.charAt(0));
            System.out.println("Last character: " + str.charAt(str.length() - 1));
            // Position 3 (1-based index 3 -> 0-based index 2; also note index 3 if 0-based)
            if (str.length() >= 3) {
                System.out.println("Character at position 3 (index 2): " + str.charAt(2));
            } else {
                System.out.println("String has fewer than 3 characters.");
            }
        } else {
            System.out.println("Empty string entered.");
        }
        sc.close();
    }
}

import java.util.Scanner;

public class Q15_FullNameAndInitials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = sc.nextLine().trim();
        System.out.print("Enter last name: ");
        String lastName = sc.nextLine().trim();

        String fullName = firstName + " " + lastName;
        String initials = Character.toUpperCase(firstName.charAt(0)) + "." +
                          Character.toUpperCase(lastName.charAt(0)) + ".";

        System.out.println("Full Name: " + fullName);
        System.out.println("Initials: " + initials);
        sc.close();
    }
}

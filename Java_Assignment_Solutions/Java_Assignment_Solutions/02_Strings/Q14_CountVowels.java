import java.util.Scanner;

public class Q14_CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().toLowerCase();

        int vowelCount = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
        sc.close();
    }
}

import java.util.Scanner;

public class Demo016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        String original = word.toLowerCase();
        String reversed = new StringBuilder(original).reverse().toString();
        if (original.equals(reversed)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
        sc.close();
    }

}
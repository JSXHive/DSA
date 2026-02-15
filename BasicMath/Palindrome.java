import java.util.Scanner;

public class Palindrome {

    public static void checkPalindrome(int n) {
        int rev = 0;
        int original = n;

        while (n > 0) {
            int ld = n % 10;
            rev = rev * 10 + ld;
            n = n / 10;
        }

        if (original == rev) {
            System.out.println("Number is a palindrome");
        } else {
            System.out.println("Number is not a palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = s.nextInt();

        checkPalindrome(n);
    }
}

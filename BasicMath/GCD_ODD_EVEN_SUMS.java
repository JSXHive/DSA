import java.util.Scanner;

public class GCD_ODD_EVEN_SUMS {

    public static int gcdofOddEvenSum(int n) {
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        int gcd = 1;

        for (int i = 1; i <= Math.min(oddSum, evenSum); i++) {
            if (evenSum % i == 0 && oddSum % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int result = gcdofOddEvenSum(n);
        System.out.println("GCD of EVEN and ODD sums of Number " + n + " is " + result);
    }
}

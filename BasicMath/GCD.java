import java.util.Scanner;

public class GCD {

    public static int gcdFind(int n1,int n2){
        int gcd=1;

        for (int i = 1; i <=Math.min(n1, n2); i++) {
        if (n1 % i == 0 && n2 % i == 0) {
            gcd = i;
        }
        }
        return gcd;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        int n1= s.nextInt();
        System.out.print("Enter Number 2: ");
        int n2= s.nextInt();

        int gcd=gcdFind(n1, n2);
        System.out.println("GCD is "+gcd);
    }
}

import java.util.*;

public class count_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the digits: ");
        int digits=sc.nextInt();

        int count=0;

        while(digits>0){
            int lastdigit=digits%10;
            count++;
            digits/=10;
        }

        System.out.println("Count of Digits: "+ count);
    }
}

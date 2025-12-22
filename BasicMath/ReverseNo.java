import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int RevNo=0;

        System.out.print("Enter the Number: ");
        int num= sc.nextInt();

        while(num>0){
            int lastdigit=num%10;
            RevNo=RevNo*10+lastdigit;
            num/=10;
        }
        System.out.print("Reversed Number ="+ RevNo);
    }
}

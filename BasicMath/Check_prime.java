import java.util.Scanner;

class sol{
    public void isprime(int n){
        int counter=0;
        for(int i=1; i<=n;i++){
            if(n%i==0){
                counter++;
            }
        }

        if(counter==2){
            System.out.println(n+" is a prime no");
        }else{
            System.out.println(n+" is not a prime no");
        }
    }
}

public class Check_prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=41;
        sol obj=new sol();
        obj.isprime(n);
    }
}

public class pattern8 {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>0;i--){
            //space
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=2*i-1;j>0;j--){
                System.out.print("*");
            }
            //space
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            System.out.println();    
        }
    }
}

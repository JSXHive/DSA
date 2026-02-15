public class pattern15 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(char ch='A';ch<'A'-i+5;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

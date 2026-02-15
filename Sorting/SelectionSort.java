import java.util.Scanner;
public class SelectionSort {

    public void SelectionSort(int [] arr, int n){

        for(int i=0; i<n-1; i++){
            int min= i;
                for(int j=i+1; j<n;j++){
                    if (arr[j]<arr[min]) {
                        min=j;
                    }
                }

                int temp= arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        
        System.out.print("Enter Array Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Unsorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        SelectionSort s = new SelectionSort();
        s.SelectionSort(arr, n);

        System.out.print("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

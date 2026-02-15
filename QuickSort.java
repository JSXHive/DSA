import java.util.Scanner;

public class QuickSort {
    public static int partition(int []arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp; 
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

    public static void QuickSort(int []arr,int low,int  high){
        if (low < high) {
            int pindex = partition(arr, low, high);

            QuickSort(arr, low, pindex-1);
            QuickSort(arr, pindex+1, high);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();

        int []arr = new int [n];
        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Unsorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        QuickSort(arr, 0, n-1);

        System.out.print("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

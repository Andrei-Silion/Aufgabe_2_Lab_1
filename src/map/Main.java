package map;

import java.util.Scanner;

public class Main {
    /**
     * wir sortieren rekursiv
     */
    static void bubbleSort(int arr[], int n)
    {
        if (n == 1)
        {
            return;
        }

        for (int i=0; i<n-1; i++)
        {
            if (arr[i] > arr[i+1])
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        bubbleSort(arr, n-1);
    }

    /**
     * wir berechnen min un max
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Lange: ");
        int n=console.nextInt();
        int[] arr = new int[n];
        int max = -Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            arr[i] = console.nextInt();
            if(arr[i] > max) max=arr[i];
            if(arr[i] < min) min=arr[i];
        }
        int[] sorted_arr = arr;
        bubbleSort(sorted_arr, n);
        int sum_min = 0;
        int sum_max = 0;
        int anz = 0;
        for(int i=0; i<n && anz < n-1; i++){
            sum_max += sorted_arr[n-1-i];
            sum_min += sorted_arr[i];
            anz++;
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum_max);
        System.out.println(sum_min);
    }
}

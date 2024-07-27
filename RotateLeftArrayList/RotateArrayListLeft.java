package RotateLeftArrayList;

import java.sql.Timestamp;
import java.util.Date;

public class RotateArrayListLeft {
   /**
 * @param args
 */
public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
    int d = 4;
    int n = arr.length;
    // Function calling
    Rotate(arr, d, n );

    PrintTheArray(arr, n);
   }

// Function to print elements of array
static void PrintTheArray(int arr[], int n)
{
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i]+" ");
    }
}

/**
 * @param arr
 * @param d
 */
private static void Rotate(int[] arr, int d , int n) {

    int temp[] = new int[n];
    
    int k = 0;

    for (int i = d; i < n; i++) {
        temp[k] = arr[i];
        k++;
    }

    // Storing the first d elements of array arr[]
    //  into temp
    for (int i = 0; i < d; i++) {
        temp[k] = arr[i];
        k++;
    }

    for (int i = 0; i < n; i++) {
        arr[i] = temp[i];
    }

}


}

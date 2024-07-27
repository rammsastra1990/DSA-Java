package MedianSortedArrays;

import java.util.ArrayList;
import java.util.HashMap;

public class mediansortarrays {
    public static void main(String[] args) {
        int[] arr1 = { 0,0,0,0,0};
        int[] arr2 = {-1,0,0,0,0,0,1};
        findMedian(arr1, arr2);
    }

    // odd number = n+1/2 th position
    // even number = n/2 th position
    // (number % 2 == 0) means even , else odd
    public static void findMedian(int[] arr1, int[] arr2) {
        int arrLen = arr1.length + arr2.length;
        HashMap arrHashMap = new HashMap<>();
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            k++;
            arrHashMap.put(k, arr1[i]);
        }

        for (int j = 0; j < arr2.length; j++) {
            k++;
            arrHashMap.put(k, arr2[j]);
        }

        arrHashMap.forEach(
                (key, value) -> System.out.println(value));

        // if even
        if (arrLen % 2 == 0) {
            int p = arrLen / 2;
            Double d1= Double.parseDouble(arrHashMap.get(p).toString());
            Double d2 =Double.parseDouble(arrHashMap.get(p+1).toString());
            System.out.println("d1 and d2 are " + d1+ " " + d2); 
            double median = (d1+d2)/2;
            System.out.println(" Even: " + median);
        }
        // else odd
        else {
            int p = arrLen + 1 / 2;
            double median = (int) arrHashMap.get(p);
            System.out.println(" Odd : " + median);
        }

    }
}

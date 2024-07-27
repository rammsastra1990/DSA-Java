package TwoSum;

// Time Complexity: O(N2), Finding pair for every element in the array of size N.
// Auxiliary Space: O(1)
public class bruteforce {
    public static void main(String[] args) {

        int[] intArray = new int[] { 1, 2, 3 , 5, 7 };
        twoSum(intArray, 12);
    }

    private static void twoSum(int[] intArray, int target) {

        int size= intArray.length;

        for (int i=0;i<size - 1 ; i ++) {
            for (int j=1;j< size ; j ++ ) {
                if(intArray[i] + intArray[j] == target) {
                    System.out.println(intArray[i] + " : " + intArray[j] );
                    System.out.println("Positions are: " + i + " , " + j);
                }

            }
        }


    }
 
}

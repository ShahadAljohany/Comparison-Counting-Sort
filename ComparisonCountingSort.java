
import java.util.Scanner;

public class ComparisonCountingSort {

    public static void main(String[] args) {
        //Sorts an array by comparison counting
        //Input: Array A[0..n − 1] of orderable values
        //Output: Array S[0..n − 1] of A’s elements sorted
        Scanner input = new Scanner(System.in);

        System.out.println(" Please enter the length of the array  :");
        int length = input.nextInt(); // enter the length of the array

        int[] arr = new int[length]; // craet array 

        System.out.println(" Please fill in the array with the number of numbers you entered :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt(); // fill in the array
        }

        // print before sorting elements
        System.out.print(" before sorting the array : ");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + " ,");
            } else {
                System.out.print(arr[i]);
            }
        }

        int[] sort = ComparisonCountingSort(arr); // call method 

        // print After sorting elements
        System.out.print("\n After sorting the array : ");
        for (int i = 0; i < sort.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(sort[i] + " ,");
            } else {
                System.out.print(sort[i]);
            }

        }
        System.out.println();

    }

    // Create a method to Sorts an array by comparison counting
    public static int[] ComparisonCountingSort(int[] arr) {
        int[] count = new int[arr.length]; // for count
        int[] sort = new int[arr.length]; // for elements sorted

        
        //  Initially the count array 
        for (int i = 0; i <= arr.length - 1; i++) {
            count[i] = 0;
        }

        // Compares and update count
        for (int i = 0; i <= arr.length - 2; i++) {

            for (int j = i + 1; j <= arr.length - 1; j++) {

                if (arr[i] < arr[j]) { //Compares
                    count[j] = count[j] + 1;
                } else {
                    count[i] = count[i] + 1;
                }

            }
        }
        
        // save elements after sorting in sort array
        for (int i = 0; i <= arr.length - 1; i++) {
            sort[count[i]] = arr[i];
        }
        
        return sort; //  return sort array

    }

}

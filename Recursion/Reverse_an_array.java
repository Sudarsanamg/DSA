package Recursion;

public class Reverse_an_array {
    public static int[] reverseArray(int n, int []nums) {
        // Write your code here.
        int[] arr=new int[n];
        recursion(nums,arr,n,0);
        return arr;

    }

    public static void recursion(int[] given_array,int[] arr,int n,int starting)
    {
        if(starting==n)
        {
            return;
        }
        else
        {
            int num=n-1;
            arr[starting]=given_array[num];
            recursion(given_array, arr, n-1, starting+1);
        }
    }
    public static void main(String[] args) {
        // Example usage
        int[] originalArray = {1, 2, 3, 4, 5};
        int arrayLength = originalArray.length;

        // Calling the reverseArray method
        int[] reversedArray = Reverse_an_array.reverseArray(arrayLength, originalArray);

        // Printing the original and reversed arrays
        System.out.println("Original Array:");
        printArray(originalArray);

        System.out.println("\nReversed Array:");
        printArray(reversedArray);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

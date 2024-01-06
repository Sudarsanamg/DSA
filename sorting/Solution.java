package sorting;

public class Solution {
    public static void insertionSort(int[] arr, int size) {
        //Your code goes here
        int start = 0;
        int consider = start + 1;

        for (int i = 1; i <= consider && i<size; i++) {
            if (arr[i - 1] > arr[i]) {
                int small_position = i;
                boolean con = true;
                while (con) {
                    if (arr[small_position - 1] < arr[small_position]) {
                        con = false;
                    } else {
                        int temp = arr[small_position];
                        arr[small_position] = arr[small_position - 1];
                        arr[small_position - 1] = temp;
                        if (small_position > 1) {
                            small_position--;

                        }
                    }

                }
            }
            if (consider <=size) {
                consider++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={21,12,23,1};
        insertionSort(arr, arr.length);
        for(int c:arr)
        {
            System.out.println(c);
        }
    }
}

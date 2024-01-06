
import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        for (int i = 0; i < k; i++) {
            int temp = arr.get(0);
            arr.remove(0);
            arr.add(temp);
        }
        return arr;
    }

    public static void main(String[] args) {
        // Example usage
        ArrayList<Integer> inputArray = new ArrayList<>();
        inputArray.add(1);
        inputArray.add(2);
        inputArray.add(3);
        inputArray.add(4);
        inputArray.add(5);

        int k = 4; // Number of rotations

        System.out.println("Original Array: " + inputArray);

        ArrayList<Integer> rotatedArray = rotateArray(inputArray, k);

        System.out.println("Rotated Array: " + rotatedArray);
    }
}

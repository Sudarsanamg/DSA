package Recursion;
import java.util.ArrayList;
import java.util.List;
public class FactorialMain {
    public static List<Long> factorialNumbers(long n) {
        List<Long> arr = new ArrayList<>();
        return recursion(1, n, arr);
    }

    public static List<Long> recursion(long initial, long end, List<Long> array) {
        int sum = 1;
        for (int j = 0; j < initial; j++) {
            sum += sum * j;
        }
        if (sum > end) {
            return array;
        } else {
            array.add(initial);
            return recursion(initial + 1, end, array);
        }
    }

    public static void main(String[] args) {
        long n = 7; // Replace 10 with the desired value
        List<Long> result = factorialNumbers(n);

        // Print the result
        System.out.println("Factorial Numbers less than or equal to " + n + ":");
        for (Long num : result) {
            System.out.println(num);
        }
    }
}

package Recursion;

public class N_to_1 {
    public static long sumFirstN(long n) {
        // Write your code here.
        //base case 
        return recursion(0, n);
    }
    public  static long recursion(long sum,long n)
    {
        if(n==0)
            return sum;
        else
        {
           return recursion(sum+n, n-1);
        }
    }

    public static void main(String[] args) {
       long sum= sumFirstN(5);
       System.out.println(sum);

    }
}

package Recursion;

public class Sumofn {
    public static long sumFirstN(long n) {
        // Write your code here.
        return recursion(n,0);
    }

    public  static  long recursion(long num,long sum)
    {
        if(num==0)
        {
            return sum;
        }
        else
        {
            return recursion(num-1,sum+num);
        }
    }
    public static void main(String[] args) {
        long sum=sumFirstN(7);
        System.out.println(sum);

    }
}

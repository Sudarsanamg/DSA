package Recursion;

public class Solution {
    public static boolean isPalindrome(String str) {
        // Write your code here.

        boolean con=recursion(str,0,(str.length()-1),(str.length()/2));
        return con;


    }

    public static boolean recursion(String str,int start,int end,int mid)
    {

        if(str.charAt(start)==str.charAt(end) && start <= mid)
        {
            recursion(str,start+1,end-1,mid);
        }
        else
        {
            return false;
        }
        return true;

    }
    public static void main(String[] args) {
        // Example usage
        String palindromeStr = "skdpnyegmds";

        // Calling the isPalindrome method
        boolean isPalindromic = Solution.isPalindrome(palindromeStr);

        // Printing the result
        if (isPalindromic) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}

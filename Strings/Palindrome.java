

import java.util.Scanner;

public class Palindrome {
    static void userdefinedfunc(String str)
    {
        
        int j=str.length()-1;
        boolean flag=true;
         for (int i = 0; i < j; i++) {
            if(i==j)
            {
                break;
            }
            else
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    j--;
                }
                else
                {
                    flag=false;
                    break;
                }
            }
         }
         if(flag==true)
         {
            System.out.println("Palindrome");
         }
         else
         {
            System.out.println("not a palindrome");
         }

    }
    public static void builtin(String s)
    {
        StringBuilder str=new StringBuilder(s);
        String temp=(str.reverse()).toString();
        if(temp.equals(s))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //user defined
    
        System.out.println("1 user defined");
        System.out.println("2 built in");
        System.out.println("enter:");
        int num=scanner.nextInt();
        System.out.println("enter a input");
        String s=scanner.next();


        switch (num) {
            case 1:
                userdefinedfunc(s);
                break;
            case 2:
                builtin(s);
                break;
            default:
                break;
        }

        scanner.close();
        
       
    }
}

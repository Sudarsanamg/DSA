import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int insp=0;
        int outsp=2*num-2;
       for (int i = 1; i <= 2*num; i++) {

        if(i%2==0)
        {
            System.out.println();
        }
        else
        {
            if(i==1)
            {
                System.out.print('*');
                for (int j = 1; j <= outsp; j++) {
                    System.out.print(' ');
                }
                System.out.print('*');
                outsp-=2;
                
            }
            else{
                System.out.print('*');
                for (int j = 1; j <= insp; j++) {
                    System.out.print(' ');
                }
                System.out.print('*');
                for (int j = 1; j <= outsp; j++) {
                    System.out.print(' ');
                }
                System.out.print('*');
                for (int j = 1; j <= insp; j++) {
                    System.out.print(' ');
                }
                System.out.print('*');
                insp++;
                outsp-=2;
            }
        }
        
       }
       outsp=0;
       insp--;
       for (int i = 1; i <= 2*num; i++) {
        if(i%2==0)
        {
            System.out.println();
        }
        else if(i==2*num-1)
        {
            System.out.print('*');
            for (int j = 1; j <= outsp; j++) {
                System.out.print(' ');
            }
            System.out.print('*');
        }
        else{
            System.out.print('*');
            for (int j = 1; j <=insp; j++) {
                System.out.print(' ');
            }
            System.out.print('*');
            for (int j = 1; j <= outsp; j++) {
                System.out.print(' ');
            }
            System.out.print('*');
            for (int j = 1; j <=insp; j++) {
                System.out.print(' ');
            }
            System.out.print('*');
            insp--;
            outsp+=2;

        }
       }
    }

}

/*
 * 
 * 5
*        *
**      **
* *    * *
*  *  *  *
*   **   *
*   **   *
*  *  *  *
* *    * *
**      **
*        *
 */
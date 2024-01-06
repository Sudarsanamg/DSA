package patterns;

import java.util.Scanner;

public class NT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num=scanner.nextInt();
        int s=1;
        boolean flag=false;
        int sp=(2*num)-2;

        for (int i = 1; i <=(2*num) ; i++) {
            for (int j = 1; j <=s; j++) {
                System.out.print('*');
            }
            for (int j = 1; j <=sp ; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <=s; j++) {
                System.out.print('*');
            }
            if(i==num)
            {
                flag=true;
                s=num;
                sp=0;
            }
            if(i>=num)
            {
                s=s-1;
                sp+=2;
            }

            else {
                s+=1;
                sp-=2;
            }
            System.out.println();
            }
        }
    }

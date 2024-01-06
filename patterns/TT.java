package patterns;

import java.util.Scanner;

public class TT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        int sp=(num-1)/2;
        for (int i = 1; i <=2*num-1 ; i++) {
            if(i==1 ||i==2*num-1)
            {
                for (int j = 0; j <num-1; j++) {
                    System.out.print('*');
                }
            }
            else if(i%2==0)
            {
                System.out.println();
            }
            else {
                System.out.print('*');
                for (int j = 0; j < sp; j++) {
                    System.out.print(' ');
                }
                System.out.print('*');
                System.out.println();
            }
        }
    }
}

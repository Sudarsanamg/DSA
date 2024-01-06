package patterns;

import java.util.Scanner;

public class ET {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num=5;
        int s=num-1;
        int sp=2;
        boolean flag=false;
        for (int i = 1; i <= 2*num-1 ; i++) {
            if(i==1 || i==2*num){
                for (int j = 1; j <=2*num ; j++) {
                    System.out.print('*');
                }

            }
            else
            {
                if(s==1 && sp==(2*num)-2 && flag==false)
                {
                    System.out.print('*');
                    for (int j = 1; j <= (2*num)-2; j++) {
                        System.out.print(' ');
                    }
                    System.out.println('*');
                }
                for (int j = 1; j <=s; j++) {
                    System.out.print('*');
                }
                for (int j = 1; j <= sp ; j++) {
                    System.out.print(' ');
                }
                for (int j = 1; j <=s; j++) {
                    System.out.print('*');
                }

                if(s!=1 && flag==false)
                {
                    s-=1;
                    sp+=2;
                }
                else
                {
                    flag=true;
                    s+=1;
                    sp-=2;
                }
            }
            System.out.println();
        }


    }
}
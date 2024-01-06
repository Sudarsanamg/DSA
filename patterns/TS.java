import java.util.Scanner;

public class TS{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int init=1;
        int size=num;
        int sp=0;
        

        for (int i = 0; i < num; i++) {
            //space
            for (int j = 0; j <sp; j++) {
                System.out.println(" ");
            }
            sp+=2;
            //left
            for (int j = init; j <= size ; j++) {
                System.out.println(j+" ");
            }
            init=size+1;
            size-=1;

        }
        sc.close();
    }
}
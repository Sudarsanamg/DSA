 package Temp;
import java.util.Arrays;
class Temparray {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] temp2=new int[1];
        System.out.println(temp2.length);
        temp2=a;
        int[] clone=a.clone();
        System.out.println(temp2.length);
        // int [] temp=a;
        // for(int i:temp2)
        // {
            System.out.print(Arrays.toString(a));
        // }
    }
}
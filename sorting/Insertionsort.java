package sorting;

import java.util.Arrays;

public  class Insertionsort {

    public  static  void insertion_sort(int[] arr)
    {
            for(int i=1;i<arr.length;i++)
            {
                int current_element=arr[i];
                int previ_index=i-1;

                while(i>0 && arr[i-1]>arr[i])
                {
                    int temp=arr[i];
                    arr[i]=arr[i-1];
                    arr[i-1]=temp;
                    i--;
                }

            }

    }






    public static void main(String[] args) {


        int[] arr={5,4,3,2,1};
        System.out.println(arr);
        insertion_sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
package Arrays.Easy;

import java.util.Arrays;
import java.util.Collections;
    import java.util.List;

public class II {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
       int[] result= func(arr,5);
        for (int i = 0; i < result.length; i++) {


        }
    }

    static int[] func(int[] arr,int size)
    {
        List list = Arrays.asList(arr);

        Collections.sort(list);

        int[] result= new int[2];

        result[0]=arr[size-2];
        result[1]=arr[1];
        return  result;
    }
}
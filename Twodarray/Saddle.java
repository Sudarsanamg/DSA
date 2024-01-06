package Twodarray;

import java.util.*;

public class Saddle {
    public  static int  mini(int[] arr)
    {
        int r=arr[0];
        for(int i:arr)
        {
            if(i<r)
            {
                r=i;
            }
        }
        return r;
    }


    public  static int maxi(int[] arr)
    {
        int num=arr[0];
        for(int i:arr)
        {
            if(i>num)
                num=i;
        }
        return num;
    }
    public static int saddlepoint(int[][] arr)
    {
        List<Integer> min=new ArrayList<>();
        List<Integer> max=new ArrayList<>();

        //row min;
        for(int i=0;i<arr.length;i++)
        {
            int num=mini(arr[i]);
            min.add(num);
        }
        //col max
        for(int i=0;i<arr[0].length;i++)
        {
            int col_max=0;
            for(int j = 0; j < arr.length; j++) {
                if(col_max<arr[j][i])
                {
                    col_max=arr[j][i];
                }

            }

            max.add(col_max);
        }


        System.out.println(min);
        System.out.println(max);
        int ans=0;
        for(Integer i:min)
        {

            if(max.contains(i))
                ans=i;

        }
        return ans;

    }





    public static void main(String[] args) {
        int[][] arr={{9,1,2},{8,5,7},{3,4,6}};
        int n=saddlepoint(arr);
        System.out.println(n);
    }
}
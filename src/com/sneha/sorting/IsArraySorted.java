package com.sneha.sorting;

public class IsArraySorted
{
    public static boolean isSorted(int[]arr)
    {
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]>arr[i+1])
           {
              // System.out.println("the array is not sorted");
               return false;
           }
       }
       return true;
    }
    public static void main(String[] args)
    {
        int[] arr= {1,4,7,89,12,23,45};
        System.out.println( isSorted(arr));
    }
}


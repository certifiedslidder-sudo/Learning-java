package com.sneha.sorting;
public class BubbleSort
{
    public static void print(int[] arr)
    {
        for(int ele : arr)
        {
            System.out.println(ele+" ");

        }
    }
    public static void main(String[] args)
       {
       // adjacent ele swap hota h
        // n-1 passes hote h yha
        int[] arr = { 1,32,12,6,34,63,2,91,3,};
        int n = arr.length;
        print(arr);
        for(int i=0;i<n-1;i++)
          {
            if(arr[i]> arr[i+1])
             {
                int temp = arr[i];
                arr[i] =  arr[i+1];
                arr[i+1]= temp;
             }
          }
           System.out.println();
        print(arr);
       }
}

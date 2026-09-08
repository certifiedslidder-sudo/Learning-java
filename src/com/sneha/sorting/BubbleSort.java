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
        int[] arr = {1, 32, 12, 6, 34, 63, 2, 91, 3,};
        int n = arr.length;
        print(arr);
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n-1-i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }


              // BUBBLE SORT OPTIMIZED VERSION
        for (int i = 0; i < n - 1; i++)
        {
            boolean isSorted = true;
            for(int j=0;j< n-1;j++)
            {          // this loop is checking if the array is sorted or not.
                if(arr[j]>arr[j+1])
                {
                    isSorted = false;
                    break;      // i k andr j loop mai break lga hai to bas j loop hi tootega na ki outer loop i tootega.
                }
            }
            if(isSorted == true) break;    // this is for the outer loop.
          
            for (int j = 0; j < n-1-i; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }
        print(arr);
    }
}

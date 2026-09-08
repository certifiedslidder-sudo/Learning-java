package com.sneha.sorting;
public class BubbleSortReverse
{
    public static void print(int[] arr)
    {
        for(int ele : arr)
        {
            System.out.println(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int[] arr = {1, 32, 12, 6, 34, 63, 2, 91, 3};
        int n = arr.length;
        print(arr);
        for (int i = 0; i < n - 1; i++)
        {
            int swaps = 0;
            for (int j = 0; j <n-1-i; j++)  // descending order
            {
                if (arr[j] < arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps ++;

                }
            }
            if(swaps == 0) break;
        }
        print(arr);
    }
}
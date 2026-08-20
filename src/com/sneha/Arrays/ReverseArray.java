package com.sneha.Arrays;

public class ReverseArray {
    static void main()
    {
    int[] arr = {12,34,75,9,345,34,2,5,3};
    int n = arr.length;
    int i = 0, j = n-1;
    while(i<j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
        for(int val: arr)
        {
        System.out.print( val + " ");
      }
    }
}

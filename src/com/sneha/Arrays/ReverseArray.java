package com.sneha.Arrays;

public class ReverseArray {
    static void main()
    {
   int[] arr = {12,34,75,9,345,34,2,5,3,1};
   int n = arr.length;
//  for(int i = 0;i<n;i++){    // FAILS as swapping will occurs for the whole array and the output will return the original array again.
//    for(int i = 0;i<n/2;i++){   // correct condition
//        // swap arr[i] and arr[[n-1-i]
//        int temp = arr[i];
//        arr[i] = arr[n-i-1];
//        arr[n-i-1] = temp;
//    }
   int i = 0, j = n-1;
   while(i<j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
        for(int val: arr) System.out.print( val + " ");

    }
}

package com.sneha.Arrays;
public class ReversingSelectiveElements {
    static void main()
    {
        int[] arr = {12,34,75,9,345,2,5,3,1};
        int n = arr.length;
        int i = 2, j = 5;
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
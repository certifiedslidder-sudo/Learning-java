package com.sneha.sorting;
public class BubbleSort2
{
    public static void print(int[] arr) {
        for(int ele : arr) {
            System.out.println(ele+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 32, 12, 6, 34, 63, 2, 91, 3,};
        int n = arr.length;
        print(arr);
        for (int i = 0; i < n - 1; i++) {
            boolean isSorted = true;  // this code is to check whether the array is sorted.
            for (int j = 0; j < n-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    isSorted = false;
                    break; // this break is for loop at line 15
                }
            }
            if(isSorted == true) break;  // this break is for loop at line 13
            for(int j = 0; j < n-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp =  arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
        print(arr);
    }
}              // return finishes the whole function whereas break ends a loop only.
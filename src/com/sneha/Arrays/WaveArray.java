package com.sneha.Arrays;
import java.util.Scanner;
public class WaveArray {
    public static void convertwave(int[] arr){
       int n = arr.length;
        int i = 0;
        int j = i+1;
      for(int k =0 ; k<arr.length-1;k++){
          if(arr[i] >= arr[j])
              WaveArray.swap(i,j,arr);
          else if(arr[i]<=arr[j])
              WaveArray.swap(i,j,arr);
                i++;
                j--;
        }
        for(int k =0;k<n;k++){
            System.out.print(arr[k] +" ");
        }
        System.out.println();
    }
    public static void swap(int i , int j, int[] arr){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        WaveArray.convertwave(arr);
        sc.close();
    }



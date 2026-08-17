package com.sneha.Arrays;

import java.util.Scanner;

public class SecondLargestElement {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n = input.nextInt();
        System.out.println("enter array elements: ");
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int SMAX = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if(arr[i]>largest){
                largest= arr[i];

            }
        }
        for(int i =0;i<n;i++){
            if( arr[i]!= largest && SMAX<arr[i]){
                SMAX = arr[i];
            }
        }
        System.out.println(  "The second largest element of the array is: " + SMAX);
        //System.out.println("Largest element is: "+largest);
    }
}

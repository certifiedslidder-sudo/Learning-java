package com.sneha.Arrays;

import java.util.Scanner;

public class Maximum_element {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("enter array elements: ");
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if(arr[i]>largest){
                largest= arr[i];

            }
        }
        System.out.println("Largest element is: "+largest);
    }
}

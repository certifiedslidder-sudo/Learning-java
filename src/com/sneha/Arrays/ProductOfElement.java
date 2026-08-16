package com.sneha.Arrays;

import java.util.Scanner;

public class ProductOfElement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of the array: ");
        int product = 1;
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
            product *= arr[i];
        }
        System.out.println("The product of the array is: " + product);

    }
}

package com.sneha.Arrays;

import java.util.Scanner;

public class SumOfElementOfArray {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.println("enter elements of array");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
            sum = sum + array[i];
        }
        System.out.println("Sum of elements of array is: " + sum);
    }
}
